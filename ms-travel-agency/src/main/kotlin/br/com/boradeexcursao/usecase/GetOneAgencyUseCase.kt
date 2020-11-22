package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.ObtainedAgencyDomain
import br.com.boradeexcursao.gateway.GetOneAgencyGateway
import org.springframework.stereotype.Component

@Component
class GetOneAgencyUseCase(private val getOneAgencyGateway: GetOneAgencyGateway) {

    fun execute(uuid: String) : ObtainedAgencyDomain {
        return getOneAgencyGateway.getByUuid(uuid)
    }
}