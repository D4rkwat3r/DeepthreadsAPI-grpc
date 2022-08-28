package ru.deepthreads.api.db.entity

import millis
import ru.deepthreads.api.value.Role

data class UserProfile(
    val nickname: String,
    val deepId: String,
    val avatar: String?,
    val role: Int = Role.USER.ordinal,
    val createdTime: Long = millis(),
    val subscribers: List<String> = emptyList()
)
