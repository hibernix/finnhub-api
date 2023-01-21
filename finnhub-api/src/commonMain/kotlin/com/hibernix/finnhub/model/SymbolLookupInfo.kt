package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property description Symbol description
 * @property displaySymbol Display symbol name.
 * @property symbol Unique symbol used to identify this symbol used in <code>/stock/candle</code> endpoint.
 * @property type Security type.
 */
@Serializable
data class SymbolLookupInfo(
    @SerialName("description") var description: String? = null,
    @SerialName("displaySymbol") var displaySymbol: String? = null,
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("type") var type: String? = null
)
