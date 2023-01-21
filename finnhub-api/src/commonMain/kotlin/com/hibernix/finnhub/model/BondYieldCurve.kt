package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property `data` Array of data.
 * @property code Bond's code
 */
@Serializable
data class BondYieldCurve(
    @SerialName("data") var `data`: List<BondYieldCurveInfo>? = null,
    @SerialName("code") var code: String? = null
)
