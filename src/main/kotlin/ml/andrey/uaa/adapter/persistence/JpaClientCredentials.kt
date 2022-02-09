package ml.andrey.uaa.adapter.persistence

import ml.andrey.uaa.core.domain.ClientCredentials
import java.time.Instant
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "client_credentials")
data class JpaClientCredentials(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    override val clientId: String,
    override val clientIdIssuedAt: Instant,
    override val clientSecret: String,
    override val clientSecretExpiresAt: Instant,
    override val clientName: String,
    override val clientAuthenticationMethods: String,
    override val authorizationGrantTypes: String,
    override val redirectUris: String,
    override val scopes: String,
    override val clientSettings: String,
    override val tokenSettings: String
) : ClientCredentials