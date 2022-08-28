package ru.deepthreads.api.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.deepthreads.api.grpc.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ru.deepthreads.api.grpc.Users.MAccount> getGetCurrentAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentAccount",
      requestType = com.google.protobuf.Empty.class,
      responseType = ru.deepthreads.api.grpc.Users.MAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ru.deepthreads.api.grpc.Users.MAccount> getGetCurrentAccountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ru.deepthreads.api.grpc.Users.MAccount> getGetCurrentAccountMethod;
    if ((getGetCurrentAccountMethod = AccountServiceGrpc.getGetCurrentAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetCurrentAccountMethod = AccountServiceGrpc.getGetCurrentAccountMethod) == null) {
          AccountServiceGrpc.getGetCurrentAccountMethod = getGetCurrentAccountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ru.deepthreads.api.grpc.Users.MAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.Users.MAccount.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetCurrentAccount"))
              .build();
        }
      }
    }
    return getGetCurrentAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ru.deepthreads.api.grpc.Users.MUserProfile> getGetCurrentProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentProfile",
      requestType = com.google.protobuf.Empty.class,
      responseType = ru.deepthreads.api.grpc.Users.MUserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ru.deepthreads.api.grpc.Users.MUserProfile> getGetCurrentProfileMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ru.deepthreads.api.grpc.Users.MUserProfile> getGetCurrentProfileMethod;
    if ((getGetCurrentProfileMethod = AccountServiceGrpc.getGetCurrentProfileMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetCurrentProfileMethod = AccountServiceGrpc.getGetCurrentProfileMethod) == null) {
          AccountServiceGrpc.getGetCurrentProfileMethod = getGetCurrentProfileMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ru.deepthreads.api.grpc.Users.MUserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.Users.MUserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetCurrentProfile"))
              .build();
        }
      }
    }
    return getGetCurrentProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getGetProfileByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfileById",
      requestType = ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest.class,
      responseType = ru.deepthreads.api.grpc.Users.MUserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getGetProfileByIdMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest, ru.deepthreads.api.grpc.Users.MUserProfile> getGetProfileByIdMethod;
    if ((getGetProfileByIdMethod = AccountServiceGrpc.getGetProfileByIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetProfileByIdMethod = AccountServiceGrpc.getGetProfileByIdMethod) == null) {
          AccountServiceGrpc.getGetProfileByIdMethod = getGetProfileByIdMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest, ru.deepthreads.api.grpc.Users.MUserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfileById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.Users.MUserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetProfileById"))
              .build();
        }
      }
    }
    return getGetProfileByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getChangeNicknameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeNickname",
      requestType = ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest.class,
      responseType = ru.deepthreads.api.grpc.Users.MUserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getChangeNicknameMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest, ru.deepthreads.api.grpc.Users.MUserProfile> getChangeNicknameMethod;
    if ((getChangeNicknameMethod = AccountServiceGrpc.getChangeNicknameMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getChangeNicknameMethod = AccountServiceGrpc.getChangeNicknameMethod) == null) {
          AccountServiceGrpc.getChangeNicknameMethod = getChangeNicknameMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest, ru.deepthreads.api.grpc.Users.MUserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeNickname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.Users.MUserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("ChangeNickname"))
              .build();
        }
      }
    }
    return getChangeNicknameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getChangeDeepIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeDeepId",
      requestType = ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest.class,
      responseType = ru.deepthreads.api.grpc.Users.MUserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getChangeDeepIdMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest, ru.deepthreads.api.grpc.Users.MUserProfile> getChangeDeepIdMethod;
    if ((getChangeDeepIdMethod = AccountServiceGrpc.getChangeDeepIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getChangeDeepIdMethod = AccountServiceGrpc.getChangeDeepIdMethod) == null) {
          AccountServiceGrpc.getChangeDeepIdMethod = getChangeDeepIdMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest, ru.deepthreads.api.grpc.Users.MUserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeDeepId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.Users.MUserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("ChangeDeepId"))
              .build();
        }
      }
    }
    return getChangeDeepIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getChangeAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeAvatar",
      requestType = ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest.class,
      responseType = ru.deepthreads.api.grpc.Users.MUserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest,
      ru.deepthreads.api.grpc.Users.MUserProfile> getChangeAvatarMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest, ru.deepthreads.api.grpc.Users.MUserProfile> getChangeAvatarMethod;
    if ((getChangeAvatarMethod = AccountServiceGrpc.getChangeAvatarMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getChangeAvatarMethod = AccountServiceGrpc.getChangeAvatarMethod) == null) {
          AccountServiceGrpc.getChangeAvatarMethod = getChangeAvatarMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest, ru.deepthreads.api.grpc.Users.MUserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.Users.MUserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("ChangeAvatar"))
              .build();
        }
      }
    }
    return getChangeAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
      com.google.protobuf.Empty> getSubscribeToProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToProfile",
      requestType = ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
      com.google.protobuf.Empty> getSubscribeToProfileMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest, com.google.protobuf.Empty> getSubscribeToProfileMethod;
    if ((getSubscribeToProfileMethod = AccountServiceGrpc.getSubscribeToProfileMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSubscribeToProfileMethod = AccountServiceGrpc.getSubscribeToProfileMethod) == null) {
          AccountServiceGrpc.getSubscribeToProfileMethod = getSubscribeToProfileMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SubscribeToProfile"))
              .build();
        }
      }
    }
    return getSubscribeToProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
      com.google.protobuf.Empty> getUnsubscribeFromProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsubscribeFromProfile",
      requestType = ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
      com.google.protobuf.Empty> getUnsubscribeFromProfileMethod() {
    io.grpc.MethodDescriptor<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest, com.google.protobuf.Empty> getUnsubscribeFromProfileMethod;
    if ((getUnsubscribeFromProfileMethod = AccountServiceGrpc.getUnsubscribeFromProfileMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUnsubscribeFromProfileMethod = AccountServiceGrpc.getUnsubscribeFromProfileMethod) == null) {
          AccountServiceGrpc.getUnsubscribeFromProfileMethod = getUnsubscribeFromProfileMethod =
              io.grpc.MethodDescriptor.<ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsubscribeFromProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("UnsubscribeFromProfile"))
              .build();
        }
      }
    }
    return getUnsubscribeFromProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrentAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentAccountMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentProfile(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentProfileMethod(), responseObserver);
    }

    /**
     */
    public void getProfileById(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileByIdMethod(), responseObserver);
    }

    /**
     */
    public void changeNickname(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeNicknameMethod(), responseObserver);
    }

    /**
     */
    public void changeDeepId(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeDeepIdMethod(), responseObserver);
    }

    /**
     */
    public void changeAvatar(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeAvatarMethod(), responseObserver);
    }

    /**
     */
    public void subscribeToProfile(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToProfileMethod(), responseObserver);
    }

    /**
     */
    public void unsubscribeFromProfile(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribeFromProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                ru.deepthreads.api.grpc.Users.MAccount>(
                  this, METHODID_GET_CURRENT_ACCOUNT)))
          .addMethod(
            getGetCurrentProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                ru.deepthreads.api.grpc.Users.MUserProfile>(
                  this, METHODID_GET_CURRENT_PROFILE)))
          .addMethod(
            getGetProfileByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
                ru.deepthreads.api.grpc.Users.MUserProfile>(
                  this, METHODID_GET_PROFILE_BY_ID)))
          .addMethod(
            getChangeNicknameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest,
                ru.deepthreads.api.grpc.Users.MUserProfile>(
                  this, METHODID_CHANGE_NICKNAME)))
          .addMethod(
            getChangeDeepIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest,
                ru.deepthreads.api.grpc.Users.MUserProfile>(
                  this, METHODID_CHANGE_DEEP_ID)))
          .addMethod(
            getChangeAvatarMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest,
                ru.deepthreads.api.grpc.Users.MUserProfile>(
                  this, METHODID_CHANGE_AVATAR)))
          .addMethod(
            getSubscribeToProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SUBSCRIBE_TO_PROFILE)))
          .addMethod(
            getUnsubscribeFromProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UNSUBSCRIBE_FROM_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentProfile(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfileById(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeNickname(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeNicknameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDeepId(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeDeepIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAvatar(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest request,
        io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToProfile(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeToProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unsubscribeFromProfile(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeFromProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.deepthreads.api.grpc.Users.MAccount getCurrentAccount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.Users.MUserProfile getCurrentProfile(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.Users.MUserProfile getProfileById(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.Users.MUserProfile changeNickname(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeNicknameMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.Users.MUserProfile changeDeepId(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeDeepIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.deepthreads.api.grpc.Users.MUserProfile changeAvatar(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty subscribeToProfile(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeToProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty unsubscribeFromProfile(ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeFromProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.Users.MAccount> getCurrentAccount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.Users.MUserProfile> getCurrentProfile(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.Users.MUserProfile> getProfileById(
        ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.Users.MUserProfile> changeNickname(
        ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeNicknameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.Users.MUserProfile> changeDeepId(
        ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeDeepIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.deepthreads.api.grpc.Users.MUserProfile> changeAvatar(
        ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> subscribeToProfile(
        ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeToProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unsubscribeFromProfile(
        ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeFromProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_ACCOUNT = 0;
  private static final int METHODID_GET_CURRENT_PROFILE = 1;
  private static final int METHODID_GET_PROFILE_BY_ID = 2;
  private static final int METHODID_CHANGE_NICKNAME = 3;
  private static final int METHODID_CHANGE_DEEP_ID = 4;
  private static final int METHODID_CHANGE_AVATAR = 5;
  private static final int METHODID_SUBSCRIBE_TO_PROFILE = 6;
  private static final int METHODID_UNSUBSCRIBE_FROM_PROFILE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_ACCOUNT:
          serviceImpl.getCurrentAccount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MAccount>) responseObserver);
          break;
        case METHODID_GET_CURRENT_PROFILE:
          serviceImpl.getCurrentProfile((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile>) responseObserver);
          break;
        case METHODID_GET_PROFILE_BY_ID:
          serviceImpl.getProfileById((ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile>) responseObserver);
          break;
        case METHODID_CHANGE_NICKNAME:
          serviceImpl.changeNickname((ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile>) responseObserver);
          break;
        case METHODID_CHANGE_DEEP_ID:
          serviceImpl.changeDeepId((ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeDeepIdRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile>) responseObserver);
          break;
        case METHODID_CHANGE_AVATAR:
          serviceImpl.changeAvatar((ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest) request,
              (io.grpc.stub.StreamObserver<ru.deepthreads.api.grpc.Users.MUserProfile>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_PROFILE:
          serviceImpl.subscribeToProfile((ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE_FROM_PROFILE:
          serviceImpl.unsubscribeFromProfile((ru.deepthreads.api.grpc.AccountServiceOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.deepthreads.api.grpc.AccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentAccountMethod())
              .addMethod(getGetCurrentProfileMethod())
              .addMethod(getGetProfileByIdMethod())
              .addMethod(getChangeNicknameMethod())
              .addMethod(getChangeDeepIdMethod())
              .addMethod(getChangeAvatarMethod())
              .addMethod(getSubscribeToProfileMethod())
              .addMethod(getUnsubscribeFromProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
