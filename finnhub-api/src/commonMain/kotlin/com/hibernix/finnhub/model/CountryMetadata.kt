package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property country Country name
 * @property code2 Alpha 2 code
 * @property code3 Alpha 3 code
 * @property codeNo UN code
 * @property currency Currency name
 * @property currencyCode Currency code
 * @property region Region
 * @property subRegion Sub-Region
 */
@Serializable
data class CountryMetadata(
    @SerialName("country") var country: String? = null,
    @SerialName("code2") var code2: String? = null,
    @SerialName("code3") var code3: String? = null,
    @SerialName("codeNo") var codeNo: String? = null,
    @SerialName("currency") var currency: String? = null,
    @SerialName("currencyCode") var currencyCode: String? = null,
    @SerialName("region") var region: String? = null,
    @SerialName("subRegion") var subRegion: String? = null
)
