package br.com.boradeexcursao.gateway.database.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("logos")
data class AgencyLogoEntity(
        @Id
        val id: String? = "",
        val agencyId: String,
        val url: String

) {
        constructor(agencyId: String, url: String) : this(null, agencyId, url)
}