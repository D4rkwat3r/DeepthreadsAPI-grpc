package ru.deepthreads.api.service

import ru.deepthreads.api.ApiUtils
import ru.deepthreads.api.ModelConvUtils
import ru.deepthreads.api.db.Users
import ru.deepthreads.api.db.entity.Account
import ru.deepthreads.api.grpc.*
import ru.deepthreads.api.grpc.AuthServiceOuterClass
import ru.deepthreads.api.interceptor.AuthInterceptor
import ru.deepthreads.api.log.ApiLogger
import ru.deepthreads.api.value.ApiConst
import java.util.*


class AuthService(private val users: Users) : AuthServiceGrpcKt.AuthServiceCoroutineImplBase() {

    private fun response(accountEntity: Account): AuthServiceOuterClass.AuthResponse {
        return authResponse {
            account = ModelConvUtils.cmAccount(accountEntity)
            userProfile = ModelConvUtils.cmProfile(accountEntity)
            authToken = ApiUtils.createJWT(accountEntity)
            refreshToken = UUID.randomUUID().toString()
            authTokenLifetime = ApiConst.AUTH_TOKEN_LIFETIME
            refreshTokenLifetime = ApiConst.REFRESH_TOKEN_LIFETIME
        }
    }

    override suspend fun doLogin(request: AuthServiceOuterClass.LoginRequest): AuthServiceOuterClass.AuthResponse {
        return response(users.getByLogin(request))
    }

    override suspend fun doRegister(request: AuthServiceOuterClass.RegisterRequest): AuthServiceOuterClass.AuthResponse {
        return response(users.createAccount(request))
    }
}
