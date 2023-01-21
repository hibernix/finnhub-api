package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property symbol ETF symbol.
 * @property atDate Holdings update date.
 * @property numberOfHoldings Number of holdings.
 * @property holdings Array of holdings.
 */
@Serializable
data class ETFsHoldings(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("atDate") var atDate: LocalDate? = null,
    @SerialName("numberOfHoldings") var numberOfHoldings: Long? = null,
    @SerialName("holdings") var holdings: List<ETFHoldingsData>? = null
)
