package br.com.boradeexcursao

import br.com.boradeexcursao.domain.AddAgencyAddressDomain
import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.domain.AddAgencyPhoneDomain
import br.com.boradeexcursao.domain.AddAgencySocialMediaDomain

abstract class BaseTest {

    fun create(name: String) : AddAgencyDomain {
        val phone = AddAgencyPhoneDomain("000", "999999999")
        val address = AddAgencyAddressDomain("Campinas", "SP", "13068115", "Padre Anchieta", "Rua São Mateus", "36")
        val socialMedia = AddAgencySocialMediaDomain("Website", "http://boradeexcurcao.com.br")
        return AddAgencyDomain(
                name,
                "26.109434.10.0001-8",
                "25.272.207/0001-26",
                "boradeexcursao@boradeexcursao.com.br",
                "Lenilson Teixeira",
                address,
                listOf(phone),
                listOf(socialMedia))
    }
}