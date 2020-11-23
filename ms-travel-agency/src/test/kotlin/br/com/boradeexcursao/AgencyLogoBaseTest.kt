package br.com.boradeexcursao

import br.com.boradeexcursao.domain.SaveAgencyLogoDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyLogoEntity
import br.com.boradeexcursao.gateway.database.repository.AgencyLogoRepository
import br.com.boradeexcursao.gateway.translator.SaveAgencyLogoDomainToAgencyLogoEntityTranslator
import br.com.boradeexcursao.mongodb.EmbeddedMongoDB
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired

abstract class AgencyLogoBaseTest {

    @Autowired
    lateinit var agencyLogoRepository: AgencyLogoRepository

    @BeforeEach
    fun setUp() {
        EmbeddedMongoDB.start();
    }

    @AfterEach
    fun clear() {
        agencyLogoRepository.deleteAll()
        EmbeddedMongoDB.stop()
    }

    fun buildAgencyLogo(agencyId: String, url: String) : SaveAgencyLogoDomain {
        return SaveAgencyLogoDomain(agencyId, url)
    }

    fun create(saveAgencyLogoDomain: SaveAgencyLogoDomain) : AgencyLogoEntity {
        return agencyLogoRepository.save(SaveAgencyLogoDomainToAgencyLogoEntityTranslator.translate(saveAgencyLogoDomain))
    }
}