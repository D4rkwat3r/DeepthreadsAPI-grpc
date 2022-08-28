package ru.deepthreads.api.db

import com.mongodb.client.MongoDatabase
import org.litote.kmongo.*

object Database {
    val client: MongoDatabase = KMongo.createClient("mongodb://localhost:27017")
        .getDatabase("Deepthreads")

    inline fun <reified T : Any> collection(name: String) = client.getCollection<T>(name)
}
