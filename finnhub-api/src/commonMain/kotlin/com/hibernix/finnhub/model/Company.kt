package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Executive name
 * @property age Age
 * @property title Title
 * @property since Year first appointed as executive/director of the company
 * @property sex Sex
 * @property compensation Total compensation
 * @property currency Compensation currency
 */
@Serializable
data class Company(
    @SerialName("name") var name: String? = null,
    @SerialName("age") var age: Long? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("since") var since: String? = null,
    @SerialName("sex") var sex: String? = null,
    @SerialName("compensation") var compensation: Long? = null,
    @SerialName("currency") var currency: String? = null
)
