package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol description
 * @property name Security name
 * @property isin ISIN.
 * @property cusip CUSIP.
 * @property share Number of shares.
 * @property percent Portfolio's percent
 * @property value Market value
 */
@Serializable
data class MutualFundHoldingsData(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("isin") var isin: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("share") var share: Float? = null,
    @SerialName("percent") var percent: Float? = null,
    @SerialName("value") var value: Float? = null,
)
