package ru.deepthreads.api.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: auth_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.deepthreads.api.grpc.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest,
      ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> getDoLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoLogin",
      requestType = ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest.class,
      responseType = ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest,
      ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> getDoLoginMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest, ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> getDoLoginMethod;
    if ((getDoLoginMethod = AuthServiceGrpc.getDoLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDoLoginMethod = AuthServiceGrpc.getDoLoginMethod) == null) {
          AuthServiceGrpc.getDoLoginMethod = getDoLoginMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest, ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DoLogin"))
              .build();
        }
      }
    }
    return getDoLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest,
      ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> getDoRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoRegister",
      requestType = ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest.class,
      responseType = ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest,
      ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> getDoRegisterMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest, ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> getDoRegisterMethod;
    if ((getDoRegisterMethod = AuthServiceGrpc.getDoRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDoRegisterMethod = AuthServiceGrpc.getDoRegisterMethod) == null) {
          AuthServiceGrpc.getDoRegisterMethod = getDoRegisterMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest, ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DoRegister"))
              .build();
        }
      }
    }
    return getDoRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void doLogin(ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoLoginMethod(), responseObserver);
    }

    /**
     */
    public void doRegister(ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest,
                ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse>(
                  this, METHODID_DO_LOGIN)))
          .addMethod(
            getDoRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest,
                ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse>(
                  this, METHODID_DO_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void doLogin(ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doRegister(ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse doLogin(ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse doRegister(ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> doLogin(
        ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse> doRegister(
        ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_LOGIN = 0;
  private static final int METHODID_DO_REGISTER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_LOGIN:
          serviceImpl.doLogin((ru.deepthreads.api.grpc.AuthServiceOuterClass.LoginRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse>) responseObserver);
          break;
        case METHODID_DO_REGISTER:
          serviceImpl.doRegister((ru.deepthreads.api.grpc.AuthServiceOuterClass.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.AuthServiceOuterClass.AuthResponse>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.deepthreads.api.grpc.AuthServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getDoLoginMethod())
              .addMethod(getDoRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
