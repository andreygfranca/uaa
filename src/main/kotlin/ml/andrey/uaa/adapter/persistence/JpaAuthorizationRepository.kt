package ml.andrey.uaa.adapter.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaAuthorizationRepository : JpaRepository<JpaAuthorization, Long>