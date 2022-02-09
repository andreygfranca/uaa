package ml.andrey.uaa.core.domain

import java.time.Instant

interface ClientCredentials {
    val clientId: String
    val clientIdIssuedAt: Instant
    val clientSecret: String
    val clientSecretExpiresAt: Instant
    val clientName: String
    val clientAuthenticationMethods: String
    val authorizationGrantTypes: String
    val redirectUris: String
    val scopes: String
    val clientSettings: String
    val tokenSettings: String
}