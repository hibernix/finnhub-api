package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property recipientName Company's name.
 * @property recipientParentName Company's name.
 * @property awardDescription Description.
 * @property country Recipient's country.
 * @property actionDate Period.
 * @property totalValue Income reported by lobbying firms.
 * @property performanceStartDate Performance start date.
 * @property performanceEndDate Performance end date.
 * @property awardingAgencyName Award agency.
 * @property awardingSubAgencyName Award sub-agency.
 * @property awardingOfficeName Award office name.
 * @property performanceCountry Performance country.
 * @property performanceCity Performance city.
 * @property performanceCounty Performance county.
 * @property performanceState Performance state.
 * @property performanceZipCode Performance zip code.
 * @property performanceCongressionalDistrict Performance congressional district.
 * @property naicsCode NAICS code.
 * @property permalink Permalink.
 */
@Serializable
data class UsaSpending(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("recipientName") var recipientName: String? = null,
    @SerialName("recipientParentName") var recipientParentName: String? = null,
    @SerialName("awardDescription") var awardDescription: String? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("actionDate") var actionDate: String? = null,
    @SerialName("totalValue") var totalValue: Float? = null,
    @SerialName("performanceStartDate") var performanceStartDate: String? = null,
    @SerialName("performanceEndDate") var performanceEndDate: String? = null,
    @SerialName("awardingAgencyName") var awardingAgencyName: String? = null,
    @SerialName("awardingSubAgencyName") var awardingSubAgencyName: String? = null,
    @SerialName("awardingOfficeName") var awardingOfficeName: String? = null,
    @SerialName("performanceCountry") var performanceCountry: String? = null,
    @SerialName("performanceCity") var performanceCity: String? = null,
    @SerialName("performanceCounty") var performanceCounty: String? = null,
    @SerialName("performanceState") var performanceState: String? = null,
    @SerialName("performanceZipCode") var performanceZipCode: String? = null,
    @SerialName("performanceCongressionalDistrict") var performanceCongressionalDistrict: String? = null,
    @SerialName("naicsCode") var naicsCode: String? = null,
    @SerialName("permalink") var permalink: String? = null
)
