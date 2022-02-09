package ml.andrey.uaa.adapter.persistence

import ml.andrey.uaa.core.domain.AuthorizationConsent
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationConsent
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "authorization_consent")
data class JpaAuthorizationConsent(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    override val registeredClientId: String = "",
    override val principalName: String = "",
    override val authorities: String = ""
) : AuthorizationConsent {

    fun toOAuth2AuthorizationConsent(): OAuth2AuthorizationConsent {
        return OAuth2AuthorizationConsent
            .withId(registeredClientId, principalName)
            .authorities { authorities.split(",").map { SimpleGrantedAuthority(it) }.toSet() }
            .build()
    }

}
