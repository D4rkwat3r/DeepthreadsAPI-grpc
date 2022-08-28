package ru.deepthreads.api.interceptor

import createApiException
import io.grpc.Context
import io.grpc.Contexts
import io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener
import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import ru.deepthreads.api.ApiUtils
import ru.deepthreads.api.context.AuthContext
import ru.deepthreads.api.db.entity.Account
import ru.deepthreads.api.log.ApiLogger
import ru.deepthreads.api.value.ApiCode
import ru.deepthreads.api.value.I18N

object AuthInterceptor : ServerInterceptor {
    private val authKey = Metadata.Key.of("DT-Auth-Token", Metadata.ASCII_STRING_MARSHALLER)
    private val authContext = Context.key<AuthContext>("Auth Context")
    val context: AuthContext
        get() = authContext.get() ?: throw createApiException(ApiCode.INVALID_TOKEN, I18N.INVALID_TOKEN)

    override fun <ReqT : Any?, RespT : Any?> interceptCall(
        call: ServerCall<ReqT, RespT>?,
        headers: Metadata?,
        next: ServerCallHandler<ReqT, RespT>?
    ): ServerCall.Listener<ReqT> {
        val auth = headers?.get(authKey)
        val ctx = if (auth != null) ApiUtils.decodeJWTContext(auth)
        else null
        return Contexts.interceptCall(
            Context.current().withValue(authContext, ctx),
            call,
            headers,
            next
        )
    }
}
