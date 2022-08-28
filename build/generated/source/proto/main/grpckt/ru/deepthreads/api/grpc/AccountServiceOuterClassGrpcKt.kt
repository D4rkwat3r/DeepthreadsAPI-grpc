package ru.deepthreads.api.grpc

import com.google.protobuf.Empty
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
import ru.deepthreads.api.grpc.AccountServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * ru.deepthreads.api.grpc.AccountService.
 */
public object AccountServiceGrpcKt {
  public const val SERVICE_NAME: String = AccountServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = AccountServiceGrpc.getServiceDescriptor()

  public val getCurrentAccountMethod: MethodDescriptor<Empty, Users.MAccount>
    @JvmStatic
    get() = AccountServiceGrpc.getGetCurrentAccountMethod()

  public val getCurrentProfileMethod: MethodDescriptor<Empty, Users.MUserProfile>
    @JvmStatic
    get() = AccountServiceGrpc.getGetCurrentProfileMethod()

  public val getProfileByIdMethod:
      MethodDescriptor<AccountServiceOuterClass.UserIdRequest, Users.MUserProfile>
    @JvmStatic
    get() = AccountServiceGrpc.getGetProfileByIdMethod()

  public val changeNicknameMethod:
      MethodDescriptor<AccountServiceOuterClass.ChangeNicknameRequest, Users.MUserProfile>
    @JvmStatic
    get() = AccountServiceGrpc.getChangeNicknameMethod()

  public val changeDeepIdMethod:
      MethodDescriptor<AccountServiceOuterClass.ChangeDeepIdRequest, Users.MUserProfile>
    @JvmStatic
    get() = AccountServiceGrpc.getChangeDeepIdMethod()

  public val changeAvatarMethod:
      MethodDescriptor<AccountServiceOuterClass.ChangeAvatarRequest, Users.MUserProfile>
    @JvmStatic
    get() = AccountServiceGrpc.getChangeAvatarMethod()

  public val subscribeToProfileMethod:
      MethodDescriptor<AccountServiceOuterClass.UserIdRequest, Empty>
    @JvmStatic
    get() = AccountServiceGrpc.getSubscribeToProfileMethod()

  public val unsubscribeFromProfileMethod:
      MethodDescriptor<AccountServiceOuterClass.UserIdRequest, Empty>
    @JvmStatic
    get() = AccountServiceGrpc.getUnsubscribeFromProfileMethod()

  /**
   * A stub for issuing RPCs to a(n) ru.deepthreads.api.grpc.AccountService service as suspending
   * coroutines.
   */
  @StubFor(AccountServiceGrpc::class)
  public class AccountServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AccountServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        AccountServiceCoroutineStub = AccountServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getCurrentAccount(request: Empty, headers: Metadata = Metadata()):
        Users.MAccount = unaryRpc(
      channel,
      AccountServiceGrpc.getGetCurrentAccountMethod(),
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
    public suspend fun getCurrentProfile(request: Empty, headers: Metadata = Metadata()):
        Users.MUserProfile = unaryRpc(
      channel,
      AccountServiceGrpc.getGetCurrentProfileMethod(),
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
    public suspend fun getProfileById(request: AccountServiceOuterClass.UserIdRequest,
        headers: Metadata = Metadata()): Users.MUserProfile = unaryRpc(
      channel,
      AccountServiceGrpc.getGetProfileByIdMethod(),
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
    public suspend fun changeNickname(request: AccountServiceOuterClass.ChangeNicknameRequest,
        headers: Metadata = Metadata()): Users.MUserProfile = unaryRpc(
      channel,
      AccountServiceGrpc.getChangeNicknameMethod(),
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
    public suspend fun changeDeepId(request: AccountServiceOuterClass.ChangeDeepIdRequest,
        headers: Metadata = Metadata()): Users.MUserProfile = unaryRpc(
      channel,
      AccountServiceGrpc.getChangeDeepIdMethod(),
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
    public suspend fun changeAvatar(request: AccountServiceOuterClass.ChangeAvatarRequest,
        headers: Metadata = Metadata()): Users.MUserProfile = unaryRpc(
      channel,
      AccountServiceGrpc.getChangeAvatarMethod(),
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
    public suspend fun subscribeToProfile(request: AccountServiceOuterClass.UserIdRequest,
        headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      AccountServiceGrpc.getSubscribeToProfileMethod(),
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
    public suspend fun unsubscribeFromProfile(request: AccountServiceOuterClass.UserIdRequest,
        headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      AccountServiceGrpc.getUnsubscribeFromProfileMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the ru.deepthreads.api.grpc.AccountService service based on Kotlin
   * coroutines.
   */
  public abstract class AccountServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.GetCurrentAccount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCurrentAccount(request: Empty): Users.MAccount = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.GetCurrentAccount is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.GetCurrentProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCurrentProfile(request: Empty): Users.MUserProfile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.GetCurrentProfile is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.GetProfileById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProfileById(request: AccountServiceOuterClass.UserIdRequest):
        Users.MUserProfile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.GetProfileById is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.ChangeNickname.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun changeNickname(request: AccountServiceOuterClass.ChangeNicknameRequest):
        Users.MUserProfile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.ChangeNickname is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.ChangeDeepId.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun changeDeepId(request: AccountServiceOuterClass.ChangeDeepIdRequest):
        Users.MUserProfile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.ChangeDeepId is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.ChangeAvatar.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun changeAvatar(request: AccountServiceOuterClass.ChangeAvatarRequest):
        Users.MUserProfile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.ChangeAvatar is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.AccountService.SubscribeToProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun subscribeToProfile(request: AccountServiceOuterClass.UserIdRequest):
        Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.SubscribeToProfile is unimplemented"))

    /**
     * Returns the response to an RPC for
     * ru.deepthreads.api.grpc.AccountService.UnsubscribeFromProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unsubscribeFromProfile(request: AccountServiceOuterClass.UserIdRequest):
        Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.AccountService.UnsubscribeFromProfile is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getGetCurrentAccountMethod(),
      implementation = ::getCurrentAccount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getGetCurrentProfileMethod(),
      implementation = ::getCurrentProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getGetProfileByIdMethod(),
      implementation = ::getProfileById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getChangeNicknameMethod(),
      implementation = ::changeNickname
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getChangeDeepIdMethod(),
      implementation = ::changeDeepId
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getChangeAvatarMethod(),
      implementation = ::changeAvatar
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getSubscribeToProfileMethod(),
      implementation = ::subscribeToProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AccountServiceGrpc.getUnsubscribeFromProfileMethod(),
      implementation = ::unsubscribeFromProfile
    )).build()
  }
}
