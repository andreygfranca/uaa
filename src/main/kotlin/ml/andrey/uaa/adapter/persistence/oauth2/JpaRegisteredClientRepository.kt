package ml.andrey.uaa.adapter.persistence.oauth2

import org.springframework.security.oauth2.server.authorization.client.RegisteredClient
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository

class JpaRegisteredClientRepository() : RegisteredClientRepository {

    override fun save(p0: RegisteredClient?) {
        TODO("Not yet implemented")
    }

    override fun findById(p0: String?): RegisteredClient? {
        TODO("Not yet implemented")
    }

    override fun findByClientId(p0: String?): RegisteredClient? {
        TODO("Not yet implemented")
    }
}