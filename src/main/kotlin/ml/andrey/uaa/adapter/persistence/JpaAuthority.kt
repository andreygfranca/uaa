package ml.andrey.uaa.adapter.persistence

import ml.andrey.uaa.core.domain.Authority
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "authority")
data class JpaAuthority(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    val description: String,

    val name: String

) : Authority {

    override fun getAuthority(): String = name

}
