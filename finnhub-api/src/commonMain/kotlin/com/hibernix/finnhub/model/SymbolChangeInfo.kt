package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property atDate Event's date.
 * @property oldSymbol Old symbol.
 * @property newSymbol New symbol.
 */
@Serializable
data class SymbolChangeInfo(
    @SerialName("atDate") var atDate: String? = null,
    @SerialName("oldSymbol") var oldSymbol: String? = null,
    @SerialName("newSymbol") var newSymbol: String? = null
)
