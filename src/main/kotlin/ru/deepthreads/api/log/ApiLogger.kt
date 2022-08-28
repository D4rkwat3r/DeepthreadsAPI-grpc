package ru.deepthreads.api.log

object ApiLogger {
    fun info(entity: Any, message: String) {
        println(">>> ${entity::class.simpleName}: $message")
    }

    fun warning(entity: Any, message: String) {
        println("??? ${entity::class.simpleName}: $message")
    }

    fun error(entity: Any, message: String) {
        println("!!! ${entity::class.simpleName}: $message")
    }
}
