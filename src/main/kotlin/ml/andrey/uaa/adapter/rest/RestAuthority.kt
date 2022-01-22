package ml.andrey.uaa.adapter.rest

import org.springframework.security.core.GrantedAuthority

data class RestAuthority(
    val description: String,
    val name: String
) : GrantedAuthority {

    override fun getAuthority() = name

}
