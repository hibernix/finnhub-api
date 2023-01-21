package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property articlesInLastWeek
 * @property buzz
 * @property weeklyAverage
 */
@Serializable
data class CompanyNewsStatistics(
    @SerialName("articlesInLastWeek") var articlesInLastWeek: Long? = null,
    @SerialName("buzz") var buzz: Float? = null,
    @SerialName("weeklyAverage") var weeklyAverage: Float? = null
)
