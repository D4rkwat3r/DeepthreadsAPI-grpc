package ru.deepthreads.api.service

import com.google.protobuf.Empty
import com.google.protobuf.empty
import ru.deepthreads.api.ModelConvUtils
import ru.deepthreads.api.annotation.EnableAuthentication
import ru.deepthreads.api.grpc.AccountServiceGrpcKt
import ru.deepthreads.api.grpc.AccountServiceOuterClass
import ru.deepthreads.api.db.Users
import ru.deepthreads.api.grpc.Users.MAccount
import ru.deepthreads.api.grpc.Users.MUserProfile
import ru.deepthreads.api.interceptor.AuthInterceptor

@EnableAuthentication
class AccountService(private val users: Users) : AccountServiceGrpcKt.AccountServiceCoroutineImplBase() {
    override suspend fun getCurrentAccount(request: Empty): MAccount {
        return ModelConvUtils.cmAccount(users.getById(AuthInterceptor.context.userId))
    }

    override suspend fun getCurrentProfile(request: Empty): MUserProfile {
        return ModelConvUtils.cmProfile(users.getById(AuthInterceptor.context.userId))
    }

    override suspend fun getProfileById(request: AccountServiceOuterClass.UserIdRequest): MUserProfile {
        return ModelConvUtils.cmProfile(users.getById(request.userId))
    }

    override suspend fun changeNickname(request: AccountServiceOuterClass.ChangeNicknameRequest): MUserProfile {
        return ModelConvUtils.cmProfile(users.changeNickname(request, AuthInterceptor.context.userId))
    }

    override suspend fun changeDeepId(request: AccountServiceOuterClass.ChangeDeepIdRequest): MUserProfile {
        return ModelConvUtils.cmProfile(users.changeDeepId(request, AuthInterceptor.context.userId))
    }

    override suspend fun changeAvatar(request: AccountServiceOuterClass.ChangeAvatarRequest): MUserProfile {
        return ModelConvUtils.cmProfile(users.changeAvatar(request, AuthInterceptor.context.userId))
    }

    override suspend fun subscribeToProfile(request: AccountServiceOuterClass.UserIdRequest): Empty {
        users.subscribeToProfile(request, AuthInterceptor.context.userId)
        return empty{}
    }

    override suspend fun unsubscribeFromProfile(request: AccountServiceOuterClass.UserIdRequest): Empty {
        users.unsubscribeFromUser(request, AuthInterceptor.context.userId)
        return empty{}
    }
}
