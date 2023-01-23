package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property d Date of the reading
 * @property v Value
 */
@Serializable
data class BondYieldCurveInfo(
    @SerialName("d") var d: String? = null,
    @SerialName("v") var v: Float? = null,
)
