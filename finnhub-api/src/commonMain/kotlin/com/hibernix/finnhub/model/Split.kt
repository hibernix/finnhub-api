package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property symbol Symbol.
 * @property date Split date.
 * @property fromFactor From factor.
 * @property toFactor To factor.
 */
@Serializable
data class Split(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("date") var date: LocalDate? = null,
    @SerialName("fromFactor") var fromFactor: Float? = null,
    @SerialName("toFactor") var toFactor: Float? = null
)
