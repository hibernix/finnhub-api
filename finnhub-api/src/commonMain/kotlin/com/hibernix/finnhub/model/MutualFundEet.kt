package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property isin ISIN.
 * @property data EET data.
 */
@Serializable
data class MutualFundEet(
    @SerialName("isin") var isin: String? = null,
    @SerialName("data") var data: MutualFundEetData? = null
)
