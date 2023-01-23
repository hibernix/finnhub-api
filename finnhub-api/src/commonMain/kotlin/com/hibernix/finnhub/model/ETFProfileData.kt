package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Name
 * @property assetClass Asset Class.
 * @property investmentSegment Investment Segment.
 * @property aum AUM.
 * @property nav NAV.
 * @property navCurrency NAV currency.
 * @property expenseRatio Expense ratio. For non-US funds, this is the
 * [KID ongoing charges](https://www.esma.europa.eu/sites/default/files/library/2015/11/09_1028_final_kid_ongoing_charges_methodology_for_publication_u_2_.pdf).
 * @property trackingIndex Tracking Index.
 * @property etfCompany ETF issuer.
 * @property domicile ETF domicile.
 * @property inceptionDate Inception date.
 * @property website ETF's website.
 * @property isin ISIN.
 * @property cusip CUSIP.
 * @property priceToEarnings P/E.
 * @property priceToBook P/B.
 * @property avgVolume 30-day average volume.
 * @property description ETF's description.
 * @property isInverse Whether the ETF is inverse
 * @property isLeveraged Whether the ETF is leveraged
 * @property leverageFactor Leverage factor.
 */
@Serializable
data class ETFProfileData(
    @SerialName("name") var name: String? = null,
    @SerialName("assetClass") var assetClass: String? = null,
    @SerialName("investmentSegment") var investmentSegment: String? = null,
    @SerialName("aum") var aum: Float? = null,
    @SerialName("nav") var nav: Float? = null,
    @SerialName("navCurrency") var navCurrency: String? = null,
    @SerialName("expenseRatio") var expenseRatio: Float? = null,
    @SerialName("trackingIndex") var trackingIndex: String? = null,
    @SerialName("etfCompany") var etfCompany: String? = null,
    @SerialName("domicile") var domicile: String? = null,
    @SerialName("inceptionDate") var inceptionDate: LocalDate? = null,
    @SerialName("website") var website: String? = null,
    @SerialName("isin") var isin: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("priceToEarnings") var priceToEarnings: Float? = null,
    @SerialName("priceToBook") var priceToBook: Float? = null,
    @SerialName("avgVolume") var avgVolume: Float? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("isInverse") var isInverse: Boolean? = null,
    @SerialName("isLeveraged") var isLeveraged: Boolean? = null,
    @SerialName("leverageFactor") var leverageFactor: Float? = null,
)
