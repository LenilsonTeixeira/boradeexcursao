package br.com.boradeexcursao.gateway.database.repository

import br.com.boradeexcursao.gateway.database.entity.AgencyLogoEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AgencyLogoRepository : MongoRepository<AgencyLogoEntity, String> {

    fun deleteByAgencyId(agencyId: String)

    fun findAllByAgencyId(agencyId: String) : List<AgencyLogoEntity>

}