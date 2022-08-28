package ru.deepthreads.api.value

import io.jsonwebtoken.security.Keys
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.JwtParser
import java.security.Key

object ApiConst {
    const val JWT_TOKENS_KEY_STRING: String = "bc8fb60bac4cc4a725d880ff55929343a45f8c06430350337a47f396f19ee67504470887751d90fd87fe070968cc9a0b6e1a8077e70658647abf98e28b34d00e"
    const val AUTH_TOKEN_LIFETIME: Long = 1000 * 60 * 10
    const val REFRESH_TOKEN_LIFETIME: Long = 1000 * 60 * 60 * 24 * 7
    // const val MIN_NICKNAME_LENGTH: Int = 5
    const val MIN_DEEP_ID_LENGTH: Int = 5
    const val MIN_PASSWORD_LENGTH: Int = 6
    val JWT_TOKENS_KEY: Key = Keys.hmacShaKeyFor(JWT_TOKENS_KEY_STRING.toByteArray(Charsets.UTF_8))
    val JWT_PARSER: JwtParser = Jwts.parserBuilder().setSigningKey(JWT_TOKENS_KEY).build()
}
