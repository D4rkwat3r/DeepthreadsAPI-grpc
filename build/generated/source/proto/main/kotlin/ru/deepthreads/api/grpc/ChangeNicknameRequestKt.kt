//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: account_service.proto

package ru.deepthreads.api.grpc;

@kotlin.jvm.JvmName("-initializechangeNicknameRequest")
inline fun changeNicknameRequest(block: ru.deepthreads.api.grpc.ChangeNicknameRequestKt.Dsl.() -> kotlin.Unit): ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest =
  ru.deepthreads.api.grpc.ChangeNicknameRequestKt.Dsl._create(ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest.newBuilder()).apply { block() }._build()
object ChangeNicknameRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest = _builder.build()

    /**
     * <code>string nickname = 1;</code>
     */
    var nickname: kotlin.String
      @JvmName("getNickname")
      get() = _builder.getNickname()
      @JvmName("setNickname")
      set(value) {
        _builder.setNickname(value)
      }
    /**
     * <code>string nickname = 1;</code>
     */
    fun clearNickname() {
      _builder.clearNickname()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest.copy(block: ru.deepthreads.api.grpc.ChangeNicknameRequestKt.Dsl.() -> kotlin.Unit): ru.deepthreads.api.grpc.AccountServiceOuterClass.ChangeNicknameRequest =
  ru.deepthreads.api.grpc.ChangeNicknameRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

