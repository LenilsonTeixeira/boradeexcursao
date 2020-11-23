package br.com.boradeexcursao

import br.com.boradeexcursao.usecase.SaveAgencyLogoUseCase
import java.util.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@SpringBootTest
@ExtendWith(SpringExtension::class)
class SaveAgencyLogoUseCaseTest : AgencyLogoBaseTest() {

    @Autowired
    lateinit var saveAgencyLogoUseCase: SaveAgencyLogoUseCase

    @Test
    fun saveAgencyLogo() {

        val agencyId = UUID.randomUUID().toString()

        val saveAgencyLogoDomain = buildAgencyLogo(agencyId, "/home/user/travel-agency/logos/boraviajar.png")

        saveAgencyLogoUseCase.execute(saveAgencyLogoDomain)

        val agencyLogoEntity = agencyLogoRepository.findByAgencyId(agencyId)

        Assertions.assertEquals(saveAgencyLogoDomain.agencyId, agencyLogoEntity!!.agencyId)
        Assertions.assertEquals(saveAgencyLogoDomain.url, agencyLogoEntity.url)

    }
}