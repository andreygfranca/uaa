package ml.andrey.uaa.adapter.persistence.oauth2

import org.springframework.security.oauth2.core.OAuth2TokenType
import org.springframework.security.oauth2.server.authorization.OAuth2Authorization
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationService

class JpaOAuth2AuthorizationRepository : OAuth2AuthorizationService {

    override fun save(p0: OAuth2Authorization?) {
        TODO("Not yet implemented")
    }

    override fun remove(p0: OAuth2Authorization?) {
        TODO("Not yet implemented")
    }

    override fun findById(p0: String?): OAuth2Authorization? {
        TODO("Not yet implemented")
    }

    override fun findByToken(p0: String?, p1: OAuth2TokenType?): OAuth2Authorization? {
        TODO("Not yet implemented")
    }
}