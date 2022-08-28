package ru.deepthreads.api.db

import com.mongodb.client.MongoCollection
import createApiException
import org.litote.kmongo.*
import ru.deepthreads.api.db.entity.Account
import ru.deepthreads.api.db.entity.UserProfile
import ru.deepthreads.api.db.util.MongoShellQuery
import ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest
import ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest
import ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest
import ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest
import ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest
import ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest
import ru.deepthreads.api.log.ApiLogger
import ru.deepthreads.api.value.ApiCode
import ru.deepthreads.api.value.ApiConst
import ru.deepthreads.api.value.I18N
import throwApiException
import java.util.UUID

class Users {
    private val collection: MongoCollection<Account> = Database.collection("users")

    fun getByDeepIdNullable(deepId: String): Account? {
        return collection.findOne(MongoShellQuery().key(MongoShellQuery.of("profile", "deepId"), deepId).build())
    }

    fun getByDeepId(deepId: String): Account {
        return getByDeepIdNullable(deepId) ?: throw createApiException(ApiCode.NONEXISTENT_ACCOUNT, I18N.NONEXISTENT_ACCOUNT)
    }

    fun getById(id: String): Account {
        return collection.findOne(MongoShellQuery().id(id).build()) ?: throw createApiException(ApiCode.NOT_FOUND, I18N.NOT_FOUND)
    }

    fun getByLogin(request: LoginRequest): Account {
        require(request.deepId.length > ApiConst.MIN_DEEP_ID_LENGTH) { throwApiException(ApiCode.INCORRECT_DEEP_ID_FORMAT, I18N.INCORRECT_DEEP_ID_FORMAT) }
        require(request.password.length > ApiConst.MIN_PASSWORD_LENGTH) { throwApiException(ApiCode.INCORRECT_PASSWORD_FORMAT, I18N.INCORRECT_PASSWORD_FORMAT) }
        val account = getByDeepId(request.deepId)
        return if (account.password == request.password) account
        else throw createApiException(ApiCode.WRONG_PASSWORD, I18N.WRONG_PASSWORD)
    }

    fun createAccount(request: RegisterRequest): Account {
        require(request.nickname.isNotEmpty()) {
            throwApiException(ApiCode.EMPTY_NICKNAME, I18N.EMPTY_NICKNAME)
        }
        require(request.deepId.length >= ApiConst.MIN_DEEP_ID_LENGTH) {
            throwApiException(ApiCode.INCORRECT_DEEP_ID_FORMAT, I18N.INCORRECT_DEEP_ID_FORMAT)
        }
        require(request.password.length >= ApiConst.MIN_PASSWORD_LENGTH) {
            throwApiException(ApiCode.INCORRECT_PASSWORD_FORMAT, I18N.INCORRECT_PASSWORD_FORMAT)
        }
        require(getByDeepIdNullable(request.deepId) == null) {
            throwApiException(ApiCode.TAKEN_DEEP_ID, I18N.TAKEN_DEEP_ID)
        }
        val account = Account(
            request.password,
            UserProfile(
                request.nickname,
                request.deepId,
                if (request.hasAvatarResource()) request.avatarResource else null
            )
        )
        collection.save(account)
        return account
    }

    fun changeNickname(request: ChangeNicknameRequest, id: String): Account {
        require(request.nickname.isNotEmpty()) { throwApiException(ApiCode.EMPTY_NICKNAME, I18N.EMPTY_NICKNAME) }
        collection.updateOne(
            MongoShellQuery().id(id).build(),
            MongoShellQuery().set(MongoShellQuery.of("profile", "nickname"), request.nickname).build()
        )
        return getById(id)
    }

    fun changeDeepId(request: ChangeDeepIdRequest, id: String): Account {
        require(request.deepId.length >= ApiConst.MIN_DEEP_ID_LENGTH) {
            throwApiException(ApiCode.INCORRECT_DEEP_ID_FORMAT, I18N.INCORRECT_DEEP_ID_FORMAT)
        }
        require(getById(id).deepIdEditable) {
            throwApiException(ApiCode.CANNOT_EDIT_DEEP_ID, I18N.CANNOT_EDIT_DEEP_ID)
        }
        collection.updateOne(
            MongoShellQuery().id(id).build(),
            MongoShellQuery().set(MongoShellQuery.of("profile", "deepId"), request.deepId)
        )
        collection.updateOne(
            MongoShellQuery().id(id).build(),
            MongoShellQuery().set("deepIdEditable", false)
        )
        return getById(id)
    }

    fun changeAvatar(request: ChangeAvatarRequest, id: String): Account {
        require(request.avatarResource.isNotEmpty()) { throwApiException(ApiCode.EMPTY_AVATAR, I18N.EMPTY_AVATAR) }
        collection.updateOne(
            MongoShellQuery().id(id).build(),
            MongoShellQuery().set(MongoShellQuery.of("profile", "avatar"), request.avatarResource)
        )
        return getById(id)
    }

    fun subscribeToProfile(request: UserIdRequest, id: String) {
        require(id !in getById(request.userId).profile.subscribers) { throwApiException(ApiCode.ALREADY_SUBSCRIBED, I18N.ALREADY_SUBSCRIBED) }
        collection.updateOne(
            MongoShellQuery().id(id).build(),
            MongoShellQuery().push(MongoShellQuery.of("profile", "subscribers"), request.userId)
        )
    }

    fun unsubscribeFromUser(request: UserIdRequest, id: String) {
        require(id in getById(request.userId).profile.subscribers) { throwApiException(ApiCode.NOT_SUBSCRIBED, I18N.NOT_SUBSCRIBED) }
        collection.updateOne(
            MongoShellQuery().id(id).build(),
            MongoShellQuery().pull(MongoShellQuery.of("profile", "subscribers"), request.userId)
        )
    }
}
