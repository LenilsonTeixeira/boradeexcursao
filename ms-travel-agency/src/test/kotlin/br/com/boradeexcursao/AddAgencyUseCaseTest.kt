package br.com.boradeexcursao

import br.com.boradeexcursao.usecase.AddAgencyUseCase
import org.junit.jupiter.api.Assertions
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

    @Test
    fun addAgency() {

        val agencyDomain = buildAgency("Bora Viajar","26.109434.10.0001-8","25.272.207/0001-26")

        val addedAgencyDomain = addAgencyUseCase.execute(agencyDomain)

        Assertions.assertTrue(addedAgencyDomain.uuid.isNotBlank())
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