package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property fromDate From date.
 * @property toDate To date.
 * @property `data` Array of ISIN change events.
 */
@Serializable
data class IsinChange(
    @SerialName("fromDate") var fromDate: String? = null,
    @SerialName("toDate") var toDate: String? = null,
    @SerialName("data") var `data`: List<IsinChangeInfo>? = null
)
