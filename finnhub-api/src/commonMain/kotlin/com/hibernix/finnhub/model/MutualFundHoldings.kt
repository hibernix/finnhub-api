package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property atDate Holdings update date.
 * @property numberOfHoldings Number of holdings.
 * @property holdings Array of holdings.
 */
@Serializable
data class MutualFundHoldings(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("atDate") var atDate: LocalDate? = null,
    @SerialName("numberOfHoldings") var numberOfHoldings: Long? = null,
    @SerialName("holdings") var holdings: List<MutualFundHoldingsData>? = null,
)
