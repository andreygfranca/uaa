package ml.andrey.uaa.adapter.rest

import ml.andrey.uaa.core.domain.User

data class RestUser(
    override val firstName: String,
    override val lastName: String,
    private val username: String,
    private val password: String,
    private val authorities: Set<RestAuthority>
) : User {

    override fun getAuthorities(): Set<RestAuthority> = authorities

    override fun getPassword() = password

    override fun getUsername() = username

    override fun isAccountNonExpired() =
        throw UnsupportedOperationException("Rest implementation cannot verify if user is expired")

    override fun isAccountNonLocked() = true

    override fun isCredentialsNonExpired() = true

    override fun isEnabled() = true

}
