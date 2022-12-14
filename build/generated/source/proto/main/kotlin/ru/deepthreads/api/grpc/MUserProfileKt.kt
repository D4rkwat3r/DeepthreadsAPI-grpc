//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: users.proto

package ru.deepthreads.api.grpc;

@kotlin.jvm.JvmName("-initializemUserProfile")
inline fun mUserProfile(block: ru.deepthreads.api.grpc.MUserProfileKt.Dsl.() -> kotlin.Unit): ru.deepthreads.api.grpc.Users.MUserProfile =
  ru.deepthreads.api.grpc.MUserProfileKt.Dsl._create(ru.deepthreads.api.grpc.Users.MUserProfile.newBuilder()).apply { block() }._build()
object MUserProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: ru.deepthreads.api.grpc.Users.MUserProfile.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ru.deepthreads.api.grpc.Users.MUserProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ru.deepthreads.api.grpc.Users.MUserProfile = _builder.build()

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

    /**
     * <code>string deep_id = 2;</code>
     */
    var deepId: kotlin.String
      @JvmName("getDeepId")
      get() = _builder.getDeepId()
      @JvmName("setDeepId")
      set(value) {
        _builder.setDeepId(value)
      }
    /**
     * <code>string deep_id = 2;</code>
     */
    fun clearDeepId() {
      _builder.clearDeepId()
    }

    /**
     * <code>optional string avatar = 3;</code>
     */
    var avatar: kotlin.String
      @JvmName("getAvatar")
      get() = _builder.getAvatar()
      @JvmName("setAvatar")
      set(value) {
        _builder.setAvatar(value)
      }
    /**
     * <code>optional string avatar = 3;</code>
     */
    fun clearAvatar() {
      _builder.clearAvatar()
    }
    /**
     * <code>optional string avatar = 3;</code>
     * @return Whether the avatar field is set.
     */
    fun hasAvatar(): kotlin.Boolean {
      return _builder.hasAvatar()
    }

    /**
     * <code>int32 role = 4;</code>
     */
    var role: kotlin.Int
      @JvmName("getRole")
      get() = _builder.getRole()
      @JvmName("setRole")
      set(value) {
        _builder.setRole(value)
      }
    /**
     * <code>int32 role = 4;</code>
     */
    fun clearRole() {
      _builder.clearRole()
    }

    /**
     * <code>int32 subscribers_count = 6;</code>
     */
    var subscribersCount: kotlin.Int
      @JvmName("getSubscribersCount")
      get() = _builder.getSubscribersCount()
      @JvmName("setSubscribersCount")
      set(value) {
        _builder.setSubscribersCount(value)
      }
    /**
     * <code>int32 subscribers_count = 6;</code>
     */
    fun clearSubscribersCount() {
      _builder.clearSubscribersCount()
    }

    /**
     * <code>int64 created_time = 5;</code>
     */
    var createdTime: kotlin.Long
      @JvmName("getCreatedTime")
      get() = _builder.getCreatedTime()
      @JvmName("setCreatedTime")
      set(value) {
        _builder.setCreatedTime(value)
      }
    /**
     * <code>int64 created_time = 5;</code>
     */
    fun clearCreatedTime() {
      _builder.clearCreatedTime()
    }

    /**
     * <code>string id = 7;</code>
     */
    var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 7;</code>
     */
    fun clearId() {
      _builder.clearId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ru.deepthreads.api.grpc.Users.MUserProfile.copy(block: ru.deepthreads.api.grpc.MUserProfileKt.Dsl.() -> kotlin.Unit): ru.deepthreads.api.grpc.Users.MUserProfile =
  ru.deepthreads.api.grpc.MUserProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

