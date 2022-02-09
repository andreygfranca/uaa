package ml.andrey.uaa.core.domain

import java.time.Instant


interface Authorization {
    val registeredClientId: String
    val principalName: String
    val authorizationCodeValue: String
    val authorizationCodeIssuedAt: Instant
    val authorizationCodeExpiresAt: Instant
    val authorizationCodeMetadata: String
    val accessTokenValue: String
    val accessTokenIssuedAt: Instant
    val accessTokenExpiresAt: Instant
    val accessTokenMetadata: String
    val accessTokenType: String
    val accessTokenScopes: String
    val refreshTokenValue: String
    val refreshTokenIssuedAt: Instant
    val refreshTokenExpiresAt: Instant
    val refreshTokenMetadata: String
    val oidcIdTokenValue: String
    val oidcIdTokenIssuedAt: Instant
    val oidcIdTokenExpiresAt: Instant
    val oidcIdTokenMetadata: String
    val oidcIdTokenClaims: String
}