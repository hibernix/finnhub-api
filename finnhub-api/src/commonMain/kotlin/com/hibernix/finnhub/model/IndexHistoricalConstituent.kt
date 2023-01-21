package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property symbol Symbol
 * @property action <code>add</code> or <code>remove</code>.
 * @property date Date of joining or leaving the index.
 */
@Serializable
data class IndexHistoricalConstituent(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("action") var action: String? = null,
    @SerialName("date") var date: LocalDate? = null
)
