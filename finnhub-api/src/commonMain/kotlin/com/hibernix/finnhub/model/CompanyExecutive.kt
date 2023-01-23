package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property executive Array of company's executives and members of the Board.
 */
@Serializable
data class CompanyExecutive(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("executive") var executive: List<Company>? = null,
)
