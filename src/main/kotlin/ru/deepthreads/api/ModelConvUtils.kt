package ru.deepthreads.api

import ru.deepthreads.api.db.Users
import ru.deepthreads.api.db.entity.Account
import ru.deepthreads.api.grpc.mAccount
import ru.deepthreads.api.grpc.mUserProfile
import ru.deepthreads.api.grpc.mUserProfilePreview

object ModelConvUtils {
    fun cmAccount(account: Account) = mAccount { verified = account.verified; deepIdEditable = account.deepIdEditable }
    fun cmProfilePreview(account: Account) = mUserProfilePreview {
        account.profile.let { profile ->
            nickname = profile.nickname
            if (profile.avatar != null) avatar = profile.avatar
            role = profile.role
        }
        id = account._id.toHexString()
    }
    fun cmProfile(account: Account) = mUserProfile {
        account.profile.let { profile ->
            nickname = profile.nickname
            deepId = profile.deepId
            if (profile.avatar != null)
                avatar = profile.avatar
            role = profile.role
            subscribersCount = account.profile.subscribers.size
            createdTime = profile.createdTime
        }
        id = account._id.toHexString()
    }
}
