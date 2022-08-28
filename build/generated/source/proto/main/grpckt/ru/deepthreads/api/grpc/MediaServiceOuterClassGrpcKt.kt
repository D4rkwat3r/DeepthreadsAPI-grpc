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
import ru.deepthreads.api.grpc.MediaServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * ru.deepthreads.api.grpc.MediaService.
 */
public object MediaServiceGrpcKt {
  public const val SERVICE_NAME: String = MediaServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = MediaServiceGrpc.getServiceDescriptor()

  public val uploadMediaMethod:
      MethodDescriptor<MediaServiceOuterClass.UploadMediaRequest, MediaServiceOuterClass.MediaResponse>
    @JvmStatic
    get() = MediaServiceGrpc.getUploadMediaMethod()

  public val getMediaByIdMethod:
      MethodDescriptor<MediaServiceOuterClass.MediaIdRequest, MediaServiceOuterClass.MediaResponse>
    @JvmStatic
    get() = MediaServiceGrpc.getGetMediaByIdMethod()

  public val getMediaByPathMethod:
      MethodDescriptor<MediaServiceOuterClass.MediaPathRequest, MediaServiceOuterClass.MediaResponse>
    @JvmStatic
    get() = MediaServiceGrpc.getGetMediaByPathMethod()

  /**
   * A stub for issuing RPCs to a(n) ru.deepthreads.api.grpc.MediaService service as suspending
   * coroutines.
   */
  @StubFor(MediaServiceGrpc::class)
  public class MediaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MediaServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): MediaServiceCoroutineStub
        = MediaServiceCoroutineStub(channel, callOptions)

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
    public suspend fun uploadMedia(request: MediaServiceOuterClass.UploadMediaRequest,
        headers: Metadata = Metadata()): MediaServiceOuterClass.MediaResponse = unaryRpc(
      channel,
      MediaServiceGrpc.getUploadMediaMethod(),
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
    public suspend fun getMediaById(request: MediaServiceOuterClass.MediaIdRequest,
        headers: Metadata = Metadata()): MediaServiceOuterClass.MediaResponse = unaryRpc(
      channel,
      MediaServiceGrpc.getGetMediaByIdMethod(),
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
    public suspend fun getMediaByPath(request: MediaServiceOuterClass.MediaPathRequest,
        headers: Metadata = Metadata()): MediaServiceOuterClass.MediaResponse = unaryRpc(
      channel,
      MediaServiceGrpc.getGetMediaByPathMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the ru.deepthreads.api.grpc.MediaService service based on Kotlin
   * coroutines.
   */
  public abstract class MediaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.MediaService.UploadMedia.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadMedia(request: MediaServiceOuterClass.UploadMediaRequest):
        MediaServiceOuterClass.MediaResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.MediaService.UploadMedia is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.MediaService.GetMediaById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMediaById(request: MediaServiceOuterClass.MediaIdRequest):
        MediaServiceOuterClass.MediaResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.MediaService.GetMediaById is unimplemented"))

    /**
     * Returns the response to an RPC for ru.deepthreads.api.grpc.MediaService.GetMediaByPath.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMediaByPath(request: MediaServiceOuterClass.MediaPathRequest):
        MediaServiceOuterClass.MediaResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.deepthreads.api.grpc.MediaService.GetMediaByPath is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaServiceGrpc.getUploadMediaMethod(),
      implementation = ::uploadMedia
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaServiceGrpc.getGetMediaByIdMethod(),
      implementation = ::getMediaById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MediaServiceGrpc.getGetMediaByPathMethod(),
      implementation = ::getMediaByPath
    )).build()
  }
}
