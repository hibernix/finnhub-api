package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property filingId Filing Id in Alpharesearch platform
 * @property title Filing title
 * @property filerId Id of the entity submitted the filing
 * @property symbol List of symbol associate with this filing
 * @property name Filer name
 * @property acceptanceDate Date the filing is submitted.
 * @property filedDate Date the filing is make available to the public
 * @property reportDate Date as which the filing is reported
 * @property form Filing Form
 * @property amend Amendment
 * @property source Filing Source
 * @property pageCount Estimate number of page when printing
 * @property documentCount Number of document in this filing
 * @property documents Document for this filing.
 */
@Serializable
data class InFilingResponse(
    @SerialName("filingId") var filingId: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("filerId") var filerId: String? = null,
    @SerialName("symbol") var symbol: Map<String, String?>? = null, // TODO: Any -> String
    @SerialName("name") var name: String? = null,
    @SerialName("acceptanceDate") var acceptanceDate: String? = null,
    @SerialName("filedDate") var filedDate: String? = null,
    @SerialName("reportDate") var reportDate: String? = null,
    @SerialName("form") var form: String? = null,
    @SerialName("amend") var amend: Boolean? = null,
    @SerialName("source") var source: String? = null,
    @SerialName("pageCount") var pageCount: Int? = null,
    @SerialName("documentCount") var documentCount: Int? = null,
    @SerialName("documents") var documents: List<DocumentResponse>? = null
)
