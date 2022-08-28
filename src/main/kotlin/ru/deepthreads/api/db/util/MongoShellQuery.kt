package ru.deepthreads.api.db.util

import ru.deepthreads.api.log.ApiLogger

class MongoShellQuery {

    private val string = StringBuilder().append("{")
    private val built: Boolean
    get() = string[string.lastIndex] != ','

    private fun key(key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        string.append("\"$key\"")
        string.append(":")
        if (stringValue) string.append("\"$value\"")
        else string.append(value)
        string.append(",")
        return this
    }

    private fun queryOperator(operatorName: String, key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        val q = StringBuilder().append("{\"\$$operatorName\":")
        if (stringValue) q.append("\"$value\"}")
        else q.append("$value}")
        return this.key(key, q.toString(), false)
    }

    private fun updateOperator(operatorName: String, key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        val q = StringBuilder().append("{\"$key\":")
        if (stringValue) q.append("\"$value\"}")
        else q.append("$value}")
        return this.key("\$$operatorName", q.toString(), false)
    }

    fun queryOperator(operatorName: String, key: String, value: String): MongoShellQuery {
        return this.queryOperator(operatorName, key, value, true)
    }

    fun queryOperator(operatorName: String, key: String, value: Number): MongoShellQuery {
        return this.queryOperator(operatorName, key, value, false)
    }

    fun queryOperator(operatorName: String, key: String, value: Boolean): MongoShellQuery {
        return this.queryOperator(operatorName, key, value, false)
    }

    private fun set(key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        return this.updateOperator("set", key, value, stringValue)
    }

    private fun addToSet(key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        return this.updateOperator("addToSet", key, value, stringValue)
    }

    private fun push(key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        return this.updateOperator("push", key, value, stringValue)
    }

    private fun pull(key: String, value: Any, stringValue: Boolean): MongoShellQuery {
        return this.updateOperator("pull", key, value, stringValue)
    }

    fun id(id: String): MongoShellQuery {
        return this.key("_id", "ObjectId(\"$id\")", false)
    }

    fun idOf(of: String, id: String): MongoShellQuery {
        return this.key("$of._id", "ObjectId(\"$id\")", false)
    }

    fun key(key: String, value: String): MongoShellQuery {
        return this.key(key, value, true)
    }

    fun key(key: String, value: Number): MongoShellQuery {
        return this.key(key, value, false)
    }

    fun key(key: String, value: Boolean): MongoShellQuery {
        return this.key(key, value, false)
    }

    fun regex(key: String, value: String): MongoShellQuery {
       return this.queryOperator("regex", key, value)
    }

    fun set(key: String, value: String): MongoShellQuery {
        return this.set(key, value, true)
    }

    fun set(key: String, value: Number): MongoShellQuery {
        return this.set(key, value, false)
    }

    fun set(key: String, value: Boolean): MongoShellQuery {
        return this.set(key, value, false)
    }

    fun addToSet(key: String, value: String): MongoShellQuery {
        return this.addToSet(key, value, true)
    }

    fun addToSet(key: String, value: Number): MongoShellQuery {
        return this.addToSet(key, value, false)
    }

    fun addToSet(key: String, value: Boolean): MongoShellQuery {
        return this.addToSet(key, value, false)
    }

    fun push(key: String, value: String): MongoShellQuery {
        return this.push(key, value, true)
    }

    fun push(key: String, value: Number): MongoShellQuery {
        return this.push(key, value, false)
    }

    fun push(key: String, value: Boolean): MongoShellQuery {
        return this.push(key, value, false)
    }

    fun pull(key: String, value: String): MongoShellQuery {
        return this.pull(key, value, true)
    }

    fun pull(key: String, value: Number): MongoShellQuery {
        return this.pull(key, value, false)
    }

    fun pull(key: String, value: Boolean): MongoShellQuery {
        return this.pull(key, value, false)
    }

    fun build(): String {
        if (!built) {
            string.setCharAt(string.lastIndex, '}')
        }
        val query = string.toString()
        ApiLogger.info(this, "Executing query \"$query\"")
        return string.toString()
    }

    override fun toString(): String {
        return build()
    }

    companion object {
        fun of(of: String, field: String) = "$of.$field"
    }
}
