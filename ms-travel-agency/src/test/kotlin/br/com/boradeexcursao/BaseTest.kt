package br.com.boradeexcursao

import br.com.boradeexcursao.domain.AddAgencyAddressDomain
import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.domain.AddAgencyPhoneDomain
import br.com.boradeexcursao.domain.AddAgencySocialMediaDomain
import br.com.boradeexcursao.domain.AddedAgencyDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyEntity
import br.com.boradeexcursao.gateway.database.repository.AgencyRepository
import br.com.boradeexcursao.gateway.translator.AddAgencyDomainToAgencyEntityTranslator
import br.com.boradeexcursao.gateway.translator.AgencyEntityToAddedAgencyDomainTranslator
import br.com.boradeexcursao.mongodb.EmbeddedMongoDB
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired

abstract class BaseTest {

    @Autowired
    lateinit var agencyRepository: AgencyRepository

    @BeforeEach
    fun setUp() {
        EmbeddedMongoDB.start();
    }

    @AfterEach
    fun clear() {
        agencyRepository.deleteAll()
        EmbeddedMongoDB.stop()
    }

    fun buildAgency(name: String, cadastur: String, cnpj: String) : AddAgencyDomain {
        val phone = AddAgencyPhoneDomain("000", "999999999")
        val address = AddAgencyAddressDomain("Campinas", "SP", "13068115", "Padre Anchieta", "Rua São Mateus", "36")
        val socialMedia = AddAgencySocialMediaDomain("Website", "http://boradeexcurcao.com.br")
        return AddAgencyDomain(
                name,
                cadastur,
                cnpj,
                "boradeexcursao@boradeexcursao.com.br",
                "Lenilson Teixeira",
                address,
                listOf(phone),
                listOf(socialMedia))
    }

    fun create(agencyDomain: AddAgencyDomain) : AgencyEntity{
        return agencyRepository.save(AddAgencyDomainToAgencyEntityTranslator.translate(agencyDomain))
    }
}