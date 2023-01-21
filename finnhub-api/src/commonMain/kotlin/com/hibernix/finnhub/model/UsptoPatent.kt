package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property applicationNumber Application Number.
 * @property companyFilingName Array of companies' name on the patent.
 * @property filingDate Filing date.
 * @property description Description.
 * @property filingStatus Filing status.
 * @property patentNumber Patent number.
 * @property publicationDate Publication date.
 * @property patentType Patent's type.
 * @property url URL of the original article.
 */
@Serializable
data class UsptoPatent(
    @SerialName("applicationNumber") var applicationNumber: String? = null,
    @SerialName("companyFilingName") var companyFilingName: List<String>? = null,
    @SerialName("filingDate") var filingDate: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("filingStatus") var filingStatus: String? = null,
    @SerialName("patentNumber") var patentNumber: String? = null,
    @SerialName("publicationDate") var publicationDate: String? = null,
    @SerialName("patentType") var patentType: String? = null,
    @SerialName("url") var url: String? = null
)
