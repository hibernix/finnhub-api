package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol symbol
 * @property totalESGScore Total ESG Score
 * @property environmentScore Environment Score
 * @property governanceScore Governance Score
 * @property socialScore Social Score
 * @property data Map key-value pair of key ESG data points.
 */
@Serializable
data class CompanyESG(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("totalESGScore") var totalESGScore: Float? = null,
    @SerialName("environmentScore") var environmentScore: Float? = null,
    @SerialName("governanceScore") var governanceScore: Float? = null,
    @SerialName("socialScore") var socialScore: Float? = null,
    @SerialName("data") var data: CompanyESGMap? = null
)
