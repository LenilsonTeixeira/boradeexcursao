package br.com.boradeexcursao

import br.com.boradeexcursao.gateway.database.repository.AgencyRepository
import br.com.boradeexcursao.mongodb.EmbeddedMongoDB
import br.com.boradeexcursao.usecase.AddAgencyUseCase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@SpringBootTest
@ExtendWith(SpringExtension::class)
class AddAgencyUseCaseTest() : BaseTest() {

    @Autowired
    lateinit var addAgencyUseCase: AddAgencyUseCase

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

    @Test
    fun addAgency() {

        val agencyDomain = create("Bora Viajar")

        val addedAgencyDomain = addAgencyUseCase.execute(agencyDomain)

        Assertions.assertTrue(addedAgencyDomain.uuid.toString().isNotBlank())
        Assertions.assertEquals(agencyDomain.name, addedAgencyDomain.name)
        Assertions.assertEquals(agencyDomain.cnpj, addedAgencyDomain.cnpj)
        Assertions.assertEquals(agencyDomain.cadastur, addedAgencyDomain.cadastur)
        Assertions.assertEquals(agencyDomain.email, addedAgencyDomain.email)
        Assertions.assertEquals(agencyDomain.owner, addedAgencyDomain.owner)
        Assertions.assertEquals(agencyDomain.address.state, addedAgencyDomain.address.state)
        Assertions.assertEquals(agencyDomain.address.city, addedAgencyDomain.address.city)
        Assertions.assertEquals(agencyDomain.address.neighborhood, addedAgencyDomain.address.neighborhood)
        Assertions.assertEquals(agencyDomain.address.zipCode, addedAgencyDomain.address.zipCode)
        Assertions.assertEquals(agencyDomain.address.address, addedAgencyDomain.address.address)
        Assertions.assertEquals(agencyDomain.address.number, addedAgencyDomain.address.number)
        Assertions.assertEquals(agencyDomain.phones[0].ddd, addedAgencyDomain.phones[0].ddd)
        Assertions.assertEquals(agencyDomain.phones[0].number, addedAgencyDomain.phones[0].number)
        Assertions.assertEquals(agencyDomain.socialMedias[0].name, addedAgencyDomain.socialMedias[0].name)
        Assertions.assertEquals(agencyDomain.socialMedias[0].url, addedAgencyDomain.socialMedias[0].url)
        Assertions.assertEquals(1L, agencyRepository.count())

    }
}