package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property adx ADX reading
 * @property trending Whether market is trending or going sideway
 */
@Serializable
data class Trend(
    @SerialName("adx") var adx: Float? = null,
    @SerialName("trending") var trending: Boolean? = null,
)
