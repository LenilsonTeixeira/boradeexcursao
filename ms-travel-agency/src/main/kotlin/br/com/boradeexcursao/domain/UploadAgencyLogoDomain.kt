package br.com.boradeexcursao.domain

import org.springframework.web.multipart.MultipartFile

data class UploadAgencyLogoDomain(
        val agencyId: String,
        var logo: MultipartFile
)