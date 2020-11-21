package br.com.boradeexcursao.domain

import java.util.*

data class AddedAgencyDomain(
        val uuid: UUID,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: AddedAgencyAddressDomain,
        val phones: List<AddedAgencyPhoneDomain>,
        val socialMedias: List<AddedAgencySocialMediaDomain>
)