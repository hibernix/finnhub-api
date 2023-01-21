package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property address Address of company's headquarters.
 * @property city City of company's headquarters.
 * @property country Country of company's headquarters.
 * @property currency Currency used in company filings and financials.
 * @property estimateCurrency Currency used in Estimates data.
 * @property marketCapCurrency Currency used in market capitalization.
 * @property cusip CUSIP number.
 * @property sedol Sedol number.
 * @property description Company business summary.
 * @property exchange Listed exchange.
 * @property ggroup Industry group.
 * @property gind Industry.
 * @property gsector Sector.
 * @property gsubind Sub-industry.
 * @property isin ISIN number.
 * @property naicsNationalIndustry NAICS national industry.
 * @property naics NAICS industry.
 * @property naicsSector NAICS sector.
 * @property naicsSubsector NAICS subsector.
 * @property name Company name.
 * @property phone Company phone number.
 * @property state State of company's headquarters.
 * @property ticker Company symbol/ticker as used on the listed exchange.
 * @property weburl Company website.
 * @property ipo IPO date.
 * @property marketCapitalization Market Capitalization.
 * @property shareOutstanding Number of oustanding shares.
 * @property employeeTotal Number of employee.
 * @property logo Logo image.
 * @property finnhubIndustry Finnhub industry classification.
 */
@Serializable
data class CompanyProfile(
    @SerialName("address") var address: String? = null,
    @SerialName("city") var city: String? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("currency") var currency: String? = null,
    @SerialName("estimateCurrency") var estimateCurrency: String? = null,
    @SerialName("marketCapCurrency") var marketCapCurrency: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("sedol") var sedol: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("exchange") var exchange: String? = null,
    @SerialName("ggroup") var ggroup: String? = null,
    @SerialName("gind") var gind: String? = null,
    @SerialName("gsector") var gsector: String? = null,
    @SerialName("gsubind") var gsubind: String? = null,
    @SerialName("isin") var isin: String? = null,
    @SerialName("naicsNationalIndustry") var naicsNationalIndustry: String? = null,
    @SerialName("naics") var naics: String? = null,
    @SerialName("naicsSector") var naicsSector: String? = null,
    @SerialName("naicsSubsector") var naicsSubsector: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("phone") var phone: String? = null,
    @SerialName("state") var state: String? = null,
    @SerialName("ticker") var ticker: String? = null,
    @SerialName("weburl") var weburl: String? = null,
    @SerialName("ipo") var ipo: LocalDate? = null,
    @SerialName("marketCapitalization") var marketCapitalization: Float? = null,
    @SerialName("shareOutstanding") var shareOutstanding: Float? = null,
    @SerialName("employeeTotal") var employeeTotal: Float? = null,
    @SerialName("logo") var logo: String? = null,
    @SerialName("finnhubIndustry") var finnhubIndustry: String? = null
)
