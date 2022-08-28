package ru.deepthreads.api.db.entity

import org.bson.types.ObjectId

data class Account(
    val password: String,
    val profile: UserProfile,
    val verified: Boolean = false,
    val deepIdEditable: Boolean = true,
    val _id: ObjectId = ObjectId.get()
)
