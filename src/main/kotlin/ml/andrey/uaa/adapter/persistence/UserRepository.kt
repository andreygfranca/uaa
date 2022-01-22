package ml.andrey.uaa.adapter.persistence

import ml.andrey.uaa.core.domain.User
import ml.andrey.uaa.core.port.Users
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component

@Component
class UserRepository(private val jpaUserRepository: JpaUserRepository) : Users {

    override fun byUsername(username: String): User? {
        return jpaUserRepository.findByUsername(username)
    }

    override fun create(user: User): User {
        return jpaUserRepository.save(user as JpaUser)
    }

    override fun loadUserByUsername(username: String): UserDetails {
        return byUsername(username) as UserDetails
    }

}