package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property id Filter id, use with respective field in search query body.
 * @property name Display name.
 */
@Serializable
data class SearchFilter(
    @SerialName("id") var id: String? = null,
    @SerialName("name") var name: String? = null,
)
