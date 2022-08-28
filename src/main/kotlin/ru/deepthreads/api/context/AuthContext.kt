package ru.deepthreads.api.context

data class AuthContext(
    val userId: String,
    val role: Int,
    val verified: Boolean
)
