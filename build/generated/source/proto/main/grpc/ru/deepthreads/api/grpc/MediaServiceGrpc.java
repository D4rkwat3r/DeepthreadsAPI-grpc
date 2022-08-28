package ru.deepthreads.api.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: media_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MediaServiceGrpc {

  private MediaServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.deepthreads.api.grpc.MediaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest,
      ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getUploadMediaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadMedia",
      requestType = ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest.class,
      responseType = ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest,
      ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getUploadMediaMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest, ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getUploadMediaMethod;
    if ((getUploadMediaMethod = MediaServiceGrpc.getUploadMediaMethod) == null) {
      synchronized (MediaServiceGrpc.class) {
        if ((getUploadMediaMethod = MediaServiceGrpc.getUploadMediaMethod) == null) {
          MediaServiceGrpc.getUploadMediaMethod = getUploadMediaMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest, ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadMedia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MediaServiceMethodDescriptorSupplier("UploadMedia"))
              .build();
        }
      }
    }
    return getUploadMediaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest,
      ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getGetMediaByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMediaById",
      requestType = ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest.class,
      responseType = ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest,
      ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getGetMediaByIdMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest, ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getGetMediaByIdMethod;
    if ((getGetMediaByIdMethod = MediaServiceGrpc.getGetMediaByIdMethod) == null) {
      synchronized (MediaServiceGrpc.class) {
        if ((getGetMediaByIdMethod = MediaServiceGrpc.getGetMediaByIdMethod) == null) {
          MediaServiceGrpc.getGetMediaByIdMethod = getGetMediaByIdMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest, ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMediaById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MediaServiceMethodDescriptorSupplier("GetMediaById"))
              .build();
        }
      }
    }
    return getGetMediaByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest,
      ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getGetMediaByPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMediaByPath",
      requestType = ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest.class,
      responseType = ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest,
      ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getGetMediaByPathMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest, ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getGetMediaByPathMethod;
    if ((getGetMediaByPathMethod = MediaServiceGrpc.getGetMediaByPathMethod) == null) {
      synchronized (MediaServiceGrpc.class) {
        if ((getGetMediaByPathMethod = MediaServiceGrpc.getGetMediaByPathMethod) == null) {
          MediaServiceGrpc.getGetMediaByPathMethod = getGetMediaByPathMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest, ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMediaByPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MediaServiceMethodDescriptorSupplier("GetMediaByPath"))
              .build();
        }
      }
    }
    return getGetMediaByPathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaServiceStub>() {
        @java.lang.Override
        public MediaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaServiceStub(channel, callOptions);
        }
      };
    return MediaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaServiceBlockingStub>() {
        @java.lang.Override
        public MediaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaServiceBlockingStub(channel, callOptions);
        }
      };
    return MediaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MediaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MediaServiceFutureStub>() {
        @java.lang.Override
        public MediaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MediaServiceFutureStub(channel, callOptions);
        }
      };
    return MediaServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MediaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void uploadMedia(ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMediaMethod(), responseObserver);
    }

    /**
     */
    public void getMediaById(ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMediaByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMediaByPath(ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMediaByPathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMediaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest,
                ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>(
                  this, METHODID_UPLOAD_MEDIA)))
          .addMethod(
            getGetMediaByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest,
                ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>(
                  this, METHODID_GET_MEDIA_BY_ID)))
          .addMethod(
            getGetMediaByPathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest,
                ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>(
                  this, METHODID_GET_MEDIA_BY_PATH)))
          .build();
    }
  }

  /**
   */
  public static final class MediaServiceStub extends io.grpc.stub.AbstractAsyncStub<MediaServiceStub> {
    private MediaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaServiceStub(channel, callOptions);
    }

    /**
     */
    public void uploadMedia(ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMediaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMediaById(ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMediaByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMediaByPath(ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMediaByPathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MediaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MediaServiceBlockingStub> {
    private MediaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse uploadMedia(ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMediaMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse getMediaById(ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMediaByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse getMediaByPath(ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMediaByPathMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MediaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MediaServiceFutureStub> {
    private MediaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MediaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> uploadMedia(
        ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMediaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getMediaById(
        ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMediaByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse> getMediaByPath(
        ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMediaByPathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_MEDIA = 0;
  private static final int METHODID_GET_MEDIA_BY_ID = 1;
  private static final int METHODID_GET_MEDIA_BY_PATH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MediaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MediaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_MEDIA:
          serviceImpl.uploadMedia((ru.deepthreads.api.grpc.MediaServiceOuterClass.UploadMediaRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>) responseObserver);
          break;
        case METHODID_GET_MEDIA_BY_ID:
          serviceImpl.getMediaById((ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaIdRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>) responseObserver);
          break;
        case METHODID_GET_MEDIA_BY_PATH:
          serviceImpl.getMediaByPath((ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaPathRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.MediaServiceOuterClass.MediaResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MediaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.deepthreads.api.grpc.MediaServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MediaService");
    }
  }

  private static final class MediaServiceFileDescriptorSupplier
      extends MediaServiceBaseDescriptorSupplier {
    MediaServiceFileDescriptorSupplier() {}
  }

  private static final class MediaServiceMethodDescriptorSupplier
      extends MediaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MediaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MediaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaServiceFileDescriptorSupplier())
              .addMethod(getUploadMediaMethod())
              .addMethod(getGetMediaByIdMethod())
              .addMethod(getGetMediaByPathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
