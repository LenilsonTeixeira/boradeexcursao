package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.response.UploadedAgencyLogoResponse
import br.com.boradeexcursao.domain.UploadedAgencyLogoDomain

object UploadedAgencyLogoDomainToUploadedAgencyLogoResponseTranslator {

    fun translate(uploadedAgencyLogoDomain: UploadedAgencyLogoDomain) : UploadedAgencyLogoResponse {

        return UploadedAgencyLogoResponse(uploadedAgencyLogoDomain.agencyId, uploadedAgencyLogoDomain.url)

    }
}