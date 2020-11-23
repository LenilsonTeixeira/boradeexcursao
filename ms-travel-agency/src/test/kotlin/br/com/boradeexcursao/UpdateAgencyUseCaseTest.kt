package br.com.boradeexcursao

import br.com.boradeexcursao.domain.UpdateAgencyAddressDomain
import br.com.boradeexcursao.domain.UpdateAgencyDomain
import br.com.boradeexcursao.domain.UpdateAgencyPhoneDomain
import br.com.boradeexcursao.domain.UpdateAgencySocialMediaDomain
import br.com.boradeexcursao.usecase.UpdateAgencyUseCase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.util.Assert

@SpringBootTest
@ExtendWith(SpringExtension::class)
class UpdateAgencyUseCaseTest : AgencyBaseTest() {

    @Autowired
    lateinit var updateAgencyUseCase: UpdateAgencyUseCase

    @Test
    fun updateAgency() {

        val boraViajar = create(buildAgency("Bora Viajar","26.109434.10.0001-8","25.272.207/0001-26"))

        Assert.notNull(boraViajar, "Type cannot be null")

        val address = UpdateAgencyAddressDomain(boraViajar.address.city, boraViajar.address.state, boraViajar.address.zipCode,
        boraViajar.address.neighborhood, boraViajar.address.address, boraViajar.address.number)

        val socialMedias = listOf(UpdateAgencySocialMediaDomain("Facebook", "https://pt-br.facebook.com/boraviajar/"))

        val phones = listOf(UpdateAgencyPhoneDomain("019", "999990000"))

        val updateAgencyDomain = UpdateAgencyDomain(boraViajar.id!!, boraViajar.uuid, boraViajar.name, boraViajar.cadastur,
        boraViajar.cnpj, boraViajar.email, boraViajar.owner, address, phones, socialMedias)

        val updatedAgencyDomain = updateAgencyUseCase.execute(updateAgencyDomain)

        Assertions.assertEquals(boraViajar.uuid, updatedAgencyDomain.uuid)
        Assertions.assertEquals(boraViajar.name, updatedAgencyDomain.name)
        Assertions.assertEquals(boraViajar.cnpj, updatedAgencyDomain.cnpj)
        Assertions.assertEquals(boraViajar.cadastur, updatedAgencyDomain.cadastur)
        Assertions.assertEquals(boraViajar.email, updatedAgencyDomain.email)
        Assertions.assertEquals(boraViajar.owner, updatedAgencyDomain.owner)
        Assertions.assertEquals(boraViajar.address.state, updatedAgencyDomain.address.state)
        Assertions.assertEquals(boraViajar.address.city, updatedAgencyDomain.address.city)
        Assertions.assertEquals(boraViajar.address.neighborhood, updatedAgencyDomain.address.neighborhood)
        Assertions.assertEquals(boraViajar.address.zipCode, updatedAgencyDomain.address.zipCode)
        Assertions.assertEquals(boraViajar.address.address, updatedAgencyDomain.address.address)
        Assertions.assertEquals(boraViajar.address.number, updatedAgencyDomain.address.number)
        Assertions.assertEquals(phones[0].ddd, updatedAgencyDomain.phones[0].ddd)
        Assertions.assertEquals(phones[0].number, updatedAgencyDomain.phones[0].number)
        Assertions.assertEquals(socialMedias[0].name, updatedAgencyDomain.socialMedias[0].name)
        Assertions.assertEquals(socialMedias[0].url, updatedAgencyDomain.socialMedias[0].url)

    }
}