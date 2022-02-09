package ml.andrey.uaa.adapter.persistence.oauth2.extensions

import ml.andrey.uaa.adapter.persistence.JpaAuthorizationConsent
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationConsent

fun OAuth2AuthorizationConsent.toJpaAuthorizationConsent(): JpaAuthorizationConsent {
    return JpaAuthorizationConsent(
        registeredClientId = this.registeredClientId,
        principalName = this.principalName,
        authorities = this.authorities.joinToString(",") { it.authority }
    )
}
