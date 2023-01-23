package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property date Date of the reading
 * @property value Value
 */
@Serializable
data class EconomicDataInfo(
    @SerialName("date") var date: String? = null,
    @SerialName("value") var value: Float? = null,
)
