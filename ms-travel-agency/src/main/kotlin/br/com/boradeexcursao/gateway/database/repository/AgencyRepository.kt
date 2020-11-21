package br.com.boradeexcursao.gateway.database.repository

import br.com.boradeexcursao.gateway.database.entity.AgencyEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AgencyRepository : MongoRepository<AgencyEntity, String>