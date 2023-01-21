package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property reportDate Report date.
 * @property ownership Array of institutional investors.
 */
@Serializable
data class InstitutionalOwnershipGroup(
    @SerialName("reportDate") var reportDate: String? = null,
    @SerialName("ownership") var ownership: List<InstitutionalOwnershipInfo>? = null
)
