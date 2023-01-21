package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol description
 * @property name Security name
 * @property isin ISIN.
 * @property cusip CUSIP.
 * @property share Number of shares owned by the ETF.
 * @property percent Portfolio's percent
 * @property value Market value
 * @property assetType Asset type. Can be 1 of the following values: <code>Equity</code>, <code>ETP</code>, <code>Fund</code>, <code>Bond</code>, <code>Other</code> or empty.
 */
@Serializable
data class ETFHoldingsData(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("isin") var isin: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("share") var share: Float? = null,
    @SerialName("percent") var percent: Float? = null,
    @SerialName("value") var value: Float? = null,
    @SerialName("assetType") var assetType: String? = null
)
