package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol symbol
 * @property data Key customers and suppliers.
 */
@Serializable
data class SupplyChainRelationships(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var data: List<KeyCustomersSuppliers>? = null,
)
