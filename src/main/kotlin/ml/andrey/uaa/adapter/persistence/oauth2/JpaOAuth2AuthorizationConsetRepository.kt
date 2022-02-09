package ml.andrey.uaa.adapter.persistence.oauth2

import ml.andrey.uaa.adapter.persistence.JpaAuthorizationConsentRepository
import ml.andrey.uaa.adapter.persistence.oauth2.extensions.toJpaAuthorizationConsent
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationConsent
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationConsentService
import org.springframework.stereotype.Component

@Component
class JpaOAuth2AuthorizationConsetRepository(
    private val jpaAuthorizationConsentRepository: JpaAuthorizationConsentRepository
) : OAuth2AuthorizationConsentService {

    override fun save(oAuth2AuthorizationConsent: OAuth2AuthorizationConsent) {
        jpaAuthorizationConsentRepository.save(oAuth2AuthorizationConsent.toJpaAuthorizationConsent())
    }

    override fun remove(oAuth2AuthorizationConsent: OAuth2AuthorizationConsent) {
        jpaAuthorizationConsentRepository.deleteByRegisteredClientIdAndPrincipalName(
            oAuth2AuthorizationConsent.registeredClientId,
            oAuth2AuthorizationConsent.principalName
        )
    }

    override fun findById(registeredClientId: String, principalName: String): OAuth2AuthorizationConsent? {
        return jpaAuthorizationConsentRepository
            .findByRegisteredClientIdAndPrincipalName(registeredClientId, principalName)
            ?.toOAuth2AuthorizationConsent() ?: throw NoSuchElementException()
    }
}

