package ml.andrey.uaa.adapter.persistence

import ml.andrey.uaa.core.domain.Authorization
import java.time.Instant
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "authorization")
data class JpaAuthorization(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    override val registeredClientId: String,
    override val principalName: String,
    override val authorizationCodeValue: String,
    override val authorizationCodeIssuedAt: Instant,
    override val authorizationCodeExpiresAt: Instant,
    override val authorizationCodeMetadata: String,
    override val accessTokenValue: String,
    override val accessTokenIssuedAt: Instant,
    override val accessTokenExpiresAt: Instant,
    override val accessTokenMetadata: String,
    override val accessTokenType: String,
    override val accessTokenScopes: String,
    override val refreshTokenValue: String,
    override val refreshTokenIssuedAt: Instant,
    override val refreshTokenExpiresAt: Instant,
    override val refreshTokenMetadata: String,
    override val oidcIdTokenValue: String,
    override val oidcIdTokenIssuedAt: Instant,
    override val oidcIdTokenExpiresAt: Instant,
    override val oidcIdTokenMetadata: String,
    override val oidcIdTokenClaims: String
) : Authorization