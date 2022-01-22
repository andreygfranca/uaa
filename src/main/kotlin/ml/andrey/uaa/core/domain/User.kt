package ml.andrey.uaa.core.domain

import org.springframework.security.core.userdetails.UserDetails

interface User : UserDetails {

    val firstName: String

    val lastName: String

}