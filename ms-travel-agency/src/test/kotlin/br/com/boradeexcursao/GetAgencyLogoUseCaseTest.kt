package br.com.boradeexcursao

import br.com.boradeexcursao.usecase.GetAgencyLogoUseCase
import java.util.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.util.Assert

@SpringBootTest
@ExtendWith(SpringExtension::class)
class GetAgencyLogoUseCaseTest : AgencyLogoBaseTest() {

    @Autowired
    lateinit var getAgencyLogoUseCase: GetAgencyLogoUseCase

    @Test
    fun retrieveAgencyLogoWithSuccessfully() {

        val boraViajarAgencyId = UUID.randomUUID().toString()

        val agencyLogo = create(buildAgencyLogo(boraViajarAgencyId, "/home/user/travel-agency/logos/boraviajar.png"))

        Assert.notNull(agencyLogo, "Type cannot be null")

        val trilhaMundoAgencyId = UUID.randomUUID().toString()

        val newAgencyLogo = create(buildAgencyLogo(trilhaMundoAgencyId, "/home/user/travel-agency/logos/trilhamundo.png"))

        Assert.notNull(newAgencyLogo, "Type cannot be null")

        val retrievedAgencyLogoDomain = getAgencyLogoUseCase.execute(trilhaMundoAgencyId)

        Assertions.assertEquals(newAgencyLogo.agencyId, retrievedAgencyLogoDomain.get().agencyId)

        Assertions.assertEquals(newAgencyLogo.url, retrievedAgencyLogoDomain.get().url)

    }

    @Test
    fun searchAgencyLogoWithAgencyIdInvalid() {

        val boraViajarAgencyId = UUID.randomUUID().toString()

        val agencyLogo = create(buildAgencyLogo(boraViajarAgencyId, "/home/user/travel-agency/logos/boraviajar.png"))

        Assert.notNull(agencyLogo, "Type cannot be null")

        val trilhaMundoAgencyId = UUID.randomUUID().toString()

        val newAgencyLogo = create(buildAgencyLogo(trilhaMundoAgencyId, "/home/user/travel-agency/logos/trilhamundo.png"))

        Assert.notNull(newAgencyLogo, "Type cannot be null")

        val agencyLogoInvalid = UUID.randomUUID().toString()

        val retrievedAgencyLogoOptional = getAgencyLogoUseCase.execute(agencyLogoInvalid)

        Assertions.assertTrue(retrievedAgencyLogoOptional.isEmpty)
    }
}