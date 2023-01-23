package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property data Array of patents.
 */
@Serializable
data class UsptoPatentResult(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var data: List<UsptoPatent>? = null,
)
