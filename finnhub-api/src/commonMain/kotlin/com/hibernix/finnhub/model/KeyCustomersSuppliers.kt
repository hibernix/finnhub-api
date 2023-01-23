package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol
 * @property name Name
 * @property country Country
 * @property industry Industry
 * @property customer Whether the company is a customer.
 * @property supplier Whether the company is a supplier
 * @property oneMonthCorrelation 1-month price correlation
 * @property oneYearCorrelation 1-year price correlation
 * @property sixMonthCorrelation 6-month price correlation
 * @property threeMonthCorrelation 3-month price correlation
 * @property twoWeekCorrelation 2-week price correlation
 * @property twoYearCorrelation 2-year price correlation
 */
@Serializable
data class KeyCustomersSuppliers(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("industry") var industry: String? = null,
    @SerialName("customer") var customer: Boolean? = null,
    @SerialName("supplier") var supplier: Boolean? = null,
    @SerialName("oneMonthCorrelation") var oneMonthCorrelation: Float? = null,
    @SerialName("oneYearCorrelation") var oneYearCorrelation: Float? = null,
    @SerialName("sixMonthCorrelation") var sixMonthCorrelation: Float? = null,
    @SerialName("threeMonthCorrelation") var threeMonthCorrelation: Float? = null,
    @SerialName("twoWeekCorrelation") var twoWeekCorrelation: Float? = null,
    @SerialName("twoYearCorrelation") var twoYearCorrelation: Float? = null,
)
