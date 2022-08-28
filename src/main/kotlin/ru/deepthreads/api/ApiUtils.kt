package ru.deepthreads.api

import createApiException
import io.jsonwebtoken.Claims
import ru.deepthreads.api.db.entity.Account
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import ru.deepthreads.api.context.AuthContext
import ru.deepthreads.api.value.ApiCode
import ru.deepthreads.api.value.ApiConst
import ru.deepthreads.api.value.I18N
import java.util.Date

object ApiUtils {
    fun createJWT(account: Account): String {
        val claims = Jwts.claims()
        claims["uid"] = account._id.toHexString()
        claims["role"] = account.profile.role
        claims["verified"] = account.verified
        val current = System.currentTimeMillis()
        return Jwts.builder()
            .setClaims(claims)
            .setIssuedAt(Date(current))
            .setExpiration(Date(current + ApiConst.AUTH_TOKEN_LIFETIME))
            .setIssuer(account.profile.deepId)
            .setAudience("deepthreads.ru")
            .signWith(ApiConst.JWT_TOKENS_KEY)
            .compact()
    }

    fun decodeJWTContext(jwt: String): AuthContext? {
        return try {
            val claims = ApiConst.JWT_PARSER
                .parseClaimsJws(jwt)
                .body
            AuthContext(
                claims["uid"] as String,
                claims["role"] as Int,
                claims["verified"] as Boolean
            )
        } catch (e: Exception) {
            return null
        }
    }
}
