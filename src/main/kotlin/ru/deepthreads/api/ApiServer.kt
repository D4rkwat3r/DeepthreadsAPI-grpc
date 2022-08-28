package ru.deepthreads.api

import io.grpc.BindableService
import io.grpc.Server
import io.grpc.ServerBuilder
import io.grpc.ServerInterceptor
import io.grpc.ServerInterceptors
import io.grpc.ServerServiceDefinition
import io.grpc.protobuf.services.ProtoReflectionService
import ru.deepthreads.api.annotation.EnableAuthentication
import ru.deepthreads.api.db.Users
import ru.deepthreads.api.interceptor.AuthInterceptor
import ru.deepthreads.api.interceptor.ServiceExceptionInterceptor
import ru.deepthreads.api.interceptor.LoggerInterceptor
import ru.deepthreads.api.log.ApiLogger
import ru.deepthreads.api.service.AccountService
import ru.deepthreads.api.service.AuthService
import ru.deepthreads.api.service.MediaService
import kotlin.concurrent.thread
import kotlin.reflect.full.hasAnnotation

class ApiServer(private val port: Int) {

    private val services = arrayOf(
        AuthService(Users()),
        AccountService(Users()),
        MediaService(),
        ProtoReflectionService.newInstance()
    )
    private val interceptors = arrayOf(
        ServiceExceptionInterceptor(),
        LoggerInterceptor()
    )

    private lateinit var grpc: Server

    private fun stop() {
        ApiLogger.info(this, "Shutdown")
        grpc.shutdown()
        ApiLogger.info(this, "Server stopped")
    }

    private fun hookShutdown() {
        Runtime.getRuntime().addShutdownHook(thread(false) { stop() })
    }

    private fun serverService(server: ServerBuilder<*>, service: BindableService) {
        ApiLogger.info(this, "Adding service \"${service::class.simpleName}\"")
        if (service::class.hasAnnotation<EnableAuthentication>())
            server.addService(ServerInterceptors.intercept(service, AuthInterceptor))
        else
            server.addService(service)
    }

    private fun globalInterceptors(server: ServerBuilder<*>, interceptor: ServerInterceptor) {
        ApiLogger.info(this, "Adding global interceptor \"${interceptor::class.simpleName}\"")
        server.intercept(interceptor)
    }

    fun start() {
        ApiLogger.info(this, "Starting GRPC server on port $port")
        grpc = ServerBuilder.forPort(port).apply {
            interceptors.forEach { interceptor -> globalInterceptors(this, interceptor) }
            services.forEach { service -> serverService(this, service) }
        }.build()
        hookShutdown()
        grpc.start()
        ApiLogger.info(this, "Server started")
        grpc.awaitTermination()
    }
}
