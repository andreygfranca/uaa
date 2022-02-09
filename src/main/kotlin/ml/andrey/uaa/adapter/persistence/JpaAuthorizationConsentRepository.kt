package ml.andrey.uaa.adapter.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaAuthorizationConsentRepository : JpaRepository<JpaAuthorizationConsent, Long> {
    fun deleteByRegisteredClientIdAndPrincipalName(registeredClientId: String, principalName: String)
    fun findByRegisteredClientIdAndPrincipalName(
        registeredClientId: String,
        principalName: String
    ): JpaAuthorizationConsent?
}