package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property name Company's name.
 * @property description Description.
 * @property country Country.
 * @property year Year.
 * @property period Period.
 * @property income Income reported by lobbying firms.
 * @property expenses Expenses reported by the company.
 * @property documentUrl Document's URL.
 * @property postedName Posted name.
 * @property date Date.
 * @property clientId Client ID.
 * @property registrantId Registrant ID.
 * @property senateId Senate ID.
 * @property houseregistrantId House registrant ID.
 */
@Serializable
data class LobbyingData(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("year") var year: Long? = null,
    @SerialName("period") var period: String? = null,
    @SerialName("income") var income: Float? = null,
    @SerialName("expenses") var expenses: Float? = null,
    @SerialName("documentUrl") var documentUrl: String? = null,
    @SerialName("postedName") var postedName: String? = null,
    @SerialName("date") var date: String? = null,
    @SerialName("clientId") var clientId: String? = null,
    @SerialName("registrantId") var registrantId: String? = null,
    @SerialName("senateId") var senateId: String? = null,
    @SerialName("houseregistrantId") var houseregistrantId: String? = null
)
