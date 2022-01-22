package ml.andrey.uaa.adapter.persistence

import ml.andrey.uaa.core.domain.User
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
data class JpaUser(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,

    override val firstName: String,

    override val lastName: String,

    private val username: String,

    private val password: String,

    @ManyToMany(fetch = FetchType.EAGER)
    private val authorities: Set<JpaAuthority>

) : User {

    override fun getAuthorities() = authorities

    override fun getPassword() = password

    override fun getUsername() = username

    override fun isAccountNonExpired() = true

    override fun isAccountNonLocked() = true

    override fun isCredentialsNonExpired() = true

    override fun isEnabled() = true

}
