package ru.deepthreads.api.grpc

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import ru.deepthreads.api.grpc.AuthServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for ru.deepthreads.api.grpc.AuthService.
 */
public object AuthServiceGrpcKt {
  public const val SERVICE_NAME: String = AuthServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = AuthServiceGrpc.getServiceDescriptor()

  public val doLoginMethod:
      MethodDescriptor<AuthServiceOuterClass.LoginRequest, AuthServiceOuterClass.AuthResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getDoLoginMethod()

  public val doRegisterMethod:
      MethodDescriptor<AuthServiceOuterClass.RegisterRequest, AuthServiceOuterClass.AuthResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getDoRegisterMethod()

  /**
   * A stub for issuing RPCs to a(n) ru.deepthreads.api.grpc.AuthService service as suspending
   * coroutines.
   */
  @StubFor(AuthServiceGrpc::class)
  public class AuthServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AuthServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): AuthServiceCoroutineStub
        = AuthServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun doLogin(request: AuthServiceOuterClass.LoginRequest, headers: Metadata =
        Metadata()): AuthServiceOuterClass.AuthResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getDoLoginMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun doRegister(request: AuthServiceOuterClass.RegisterRequest, headers: Metadata
        = Metadata()): AuthServiceOuterClass.AuthResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getDoRegisterMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the ru.deepthreads.api.grpc.AuthService service based on Kotlin
   * coroutines.
   */
  public abstract class AuthServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AuthService.DoLogin.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun doLogin(request: AuthServiceOuterClass.LoginRequest):
        AuthServiceOuterClass.AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AuthService.DoLogin is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AuthService.DoRegister.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun doRegister(request: AuthServiceOuterClass.RegisterRequest):
        AuthServiceOuterClass.AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AuthService.DoRegister is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getDoLoginMethod(),
      implementation = ::doLogin
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getDoRegisterMethod(),
      implementation = ::doRegister
    )).build()
  }
}
