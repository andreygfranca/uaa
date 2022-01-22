package ml.andrey.uaa.core.port

import ml.andrey.uaa.core.domain.User
import org.springframework.security.core.userdetails.UserDetailsService

interface Users : UserDetailsService {

    fun byUsername(username: String): User?

    fun create(user: User): User

}