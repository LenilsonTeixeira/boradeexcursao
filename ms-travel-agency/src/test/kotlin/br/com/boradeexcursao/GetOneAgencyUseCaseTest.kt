package br.com.boradeexcursao

import br.com.boradeexcursao.exception.GetOneAgencyException
import br.com.boradeexcursao.usecase.GetOneAgencyUseCase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.util.Assert

@SpringBootTest
@ExtendWith(SpringExtension::class)
class GetOneAgencyUseCaseTest : BaseTest() {

    val UUID_INVALID : String = "e8e3aac9-5bf2-4d43-aa6d-48116f6941b1"

    val MESSAGE_ERROR : String = "The agency with uuid e8e3aac9-5bf2-4d43-aa6d-48116f6941b1 was not found"

    @Autowired
    lateinit var getOneAgencyUseCase: GetOneAgencyUseCase

    @Test
    fun retrieveAgencyByUuid() {

        val boraViajar = create(buildAgency("Bora Viajar","26.109434.10.0001-8","25.272.207/0001-26"))

        Assert.notNull(boraViajar, "Type cannot be null")

        val boraDeExcursao = create(buildAgency("Bora de Excursao","36.109434.10.0001-1","11.279.207/0001-26"))

        Assert.notNull(boraDeExcursao, "Type cannot be null")

        val addedAgencyDomain = getOneAgencyUseCase.execute(boraViajar.uuid)

        Assertions.assertEquals(boraViajar.uuid, addedAgencyDomain.uuid)
        Assertions.assertEquals(boraViajar.name, addedAgencyDomain.name)
        Assertions.assertEquals(boraViajar.cnpj, addedAgencyDomain.cnpj)
        Assertions.assertEquals(boraViajar.cadastur, addedAgencyDomain.cadastur)
        Assertions.assertEquals(boraViajar.email, addedAgencyDomain.email)
        Assertions.assertEquals(boraViajar.owner, addedAgencyDomain.owner)
        Assertions.assertEquals(boraViajar.address.state, addedAgencyDomain.address.state)
        Assertions.assertEquals(boraViajar.address.city, addedAgencyDomain.address.city)
        Assertions.assertEquals(boraViajar.address.neighborhood, addedAgencyDomain.address.neighborhood)
        Assertions.assertEquals(boraViajar.address.zipCode, addedAgencyDomain.address.zipCode)
        Assertions.assertEquals(boraViajar.address.address, addedAgencyDomain.address.address)
        Assertions.assertEquals(boraViajar.address.number, addedAgencyDomain.address.number)
        Assertions.assertEquals(boraViajar.phones[0].ddd, addedAgencyDomain.phones[0].ddd)
        Assertions.assertEquals(boraViajar.phones[0].number, addedAgencyDomain.phones[0].number)
        Assertions.assertEquals(boraViajar.socialMedias[0].name, addedAgencyDomain.socialMedias[0].name)
        Assertions.assertEquals(boraViajar.socialMedias[0].url, addedAgencyDomain.socialMedias[0].url)

    }

    @Test
    fun searchByUuidInvalid() {

        val boraViajar = create(buildAgency("Bora Viajar","26.109434.10.0001-8","25.272.207/0001-26"))

        Assert.notNull(boraViajar, "Type cannot be null")

        val boraDeExcursao = create(buildAgency("Bora de Excursao","36.109434.10.0001-1","11.279.207/0001-26"))

        Assert.notNull(boraDeExcursao, "Type cannot be null")

        val exception = Assertions.assertThrows(GetOneAgencyException::class.java, {getOneAgencyUseCase.execute(UUID_INVALID)})

        Assertions.assertEquals(MESSAGE_ERROR, exception.message)

    }
}