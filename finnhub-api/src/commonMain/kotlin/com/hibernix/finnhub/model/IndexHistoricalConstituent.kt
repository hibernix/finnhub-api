package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol
 * @property action ```add``` or ```remove```.
 * @property date Date of joining or leaving the index.
 */
@Serializable
data class IndexHistoricalConstituent(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("action") var action: String? = null,
    @SerialName("date") var date: LocalDate? = null,
)
