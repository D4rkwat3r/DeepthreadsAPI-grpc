//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: account_service.proto

package ru.deepthreads.api.grpc;

@kotlin.jvm.JvmName("-initializechangeAvatarRequest")
inline fun changeAvatarRequest(block: ru.deepthreads.api.grpc.ChangeAvatarRequestKt.Dsl.() -> kotlin.Unit): ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest =
  ru.deepthreads.api.grpc.ChangeAvatarRequestKt.Dsl._create(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest.newBuilder()).apply { block() }._build()
object ChangeAvatarRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest = _builder.build()

    /**
     * <code>string avatar_resource = 1;</code>
     */
    var avatarResource: kotlin.String
      @JvmName("getAvatarResource")
      get() = _builder.getAvatarResource()
      @JvmName("setAvatarResource")
      set(value) {
        _builder.setAvatarResource(value)
      }
    /**
     * <code>string avatar_resource = 1;</code>
     */
    fun clearAvatarResource() {
      _builder.clearAvatarResource()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest.copy(block: ru.deepthreads.api.grpc.ChangeAvatarRequestKt.Dsl.() -> kotlin.Unit): ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeAvatarRequest =
  ru.deepthreads.api.grpc.ChangeAvatarRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

