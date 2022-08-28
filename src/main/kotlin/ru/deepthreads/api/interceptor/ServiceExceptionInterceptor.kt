package ru.deepthreads.api.interceptor

import createApiException
import io.grpc.*
import io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener
import ru.deepthreads.api.log.ApiLogger
import ru.deepthreads.api.value.ApiCode
import ru.deepthreads.api.value.I18N

class ServiceExceptionInterceptor : ServerInterceptor {
    override fun <ReqT : Any?, RespT : Any?> interceptCall(
        call: ServerCall<ReqT, RespT>?,
        headers: Metadata?,
        next: ServerCallHandler<ReqT, RespT>?
    ): ServerCall.Listener<ReqT> {
        return object: SimpleForwardingServerCallListener<ReqT>(next?.startCall(call, headers)) {
            override fun onHalfClose() {
                try {
                    super.onHalfClose()
                } catch (e: Exception) {
                    ApiLogger.error(this@ServiceExceptionInterceptor, e.localizedMessage ?: e.message ?: e.toString())
                    call?.close(
                        Status.fromThrowable(
                            createApiException(ApiCode.INTERNAL_SERVER_ERROR, I18N.INTERNAL_SERVER_ERROR)
                        ),
                        Metadata()
                    )
                }
            }
        }
    }
}
