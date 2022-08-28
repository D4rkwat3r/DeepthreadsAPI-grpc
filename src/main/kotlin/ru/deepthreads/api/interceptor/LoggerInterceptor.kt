package ru.deepthreads.api.interceptor

import io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener
import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import ru.deepthreads.api.log.ApiLogger

class LoggerInterceptor : ServerInterceptor {
    override fun <ReqT : Any?, RespT : Any?> interceptCall(
        call: ServerCall<ReqT, RespT>?,
        headers: Metadata?,
        next: ServerCallHandler<ReqT, RespT>?
    ): ServerCall.Listener<ReqT> {
        return object : SimpleForwardingServerCallListener<ReqT>(next?.startCall(call, headers)) {
            override fun onComplete() {
                ApiLogger.info(
                    this@LoggerInterceptor,
                    "RPC processed ${call?.methodDescriptor?.fullMethodName}"
                )
                super.onComplete()
            }
        }
    }
}
