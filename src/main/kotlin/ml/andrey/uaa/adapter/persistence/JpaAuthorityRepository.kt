package ml.andrey.uaa.adapter.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface JpaAuthorityRepository : JpaRepository<JpaAuthority, Long>