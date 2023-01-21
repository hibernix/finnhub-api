package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Name
 * @property category Fund's category.
 * @property investmentSegment Investment Segment.
 * @property totalNav NAV.
 * @property expenseRatio Expense ratio.
 * @property benchmark Index benchmark.
 * @property inceptionDate Inception date.
 * @property description Fund's description.
 * @property fundFamily Fund Family.
 * @property manager Fund's managers.
 * @property status Status.
 * @property beta Beta.
 * @property deferredLoad Deferred load.
 * @property fee12b1 12B-1 fee.
 * @property frontLoad Front Load.
 * @property iraMinInvestment IRA minimum investment.
 * @property isin ISIN.
 * @property cusip CUSIP.
 * @property maxRedemptionFee Max redemption fee.
 * @property standardMinInvestment Minimum investment for standard accounts.
 * @property turnover Turnover.
 * @property seriesId Fund's series ID. This field can be used to group multiple share classes into 1 unique fund.
 * @property seriesName Fund's series name.
 * @property classId Class ID.
 * @property className Class name.
 * @property sfdrClassification SFDR classification for EU funds. Under the new classifications, a fund's strategy will labeled under either Article 6, 8 or 9. Article 6 covers funds which do not integrate any kind of sustainability into the investment process. Article 8, also known as ‘environmental and socially promoting’, applies “… where a financial product promotes, among other characteristics, environmental or social characteristics, or a combination of those characteristics, provided that the companies in which the investments are made follow good governance practices.”. Article 9, also known as ‘products targeting sustainable investments’, covers products targeting bespoke sustainable investments and applies “… where a financial product has sustainable investment as its objective and an index has been designated as a reference benchmark.”
 * @property currency Fund's currency
 */
@Serializable
data class MutualFundProfileData(
    @SerialName("name") var name: String? = null,
    @SerialName("category") var category: String? = null,
    @SerialName("investmentSegment") var investmentSegment: String? = null,
    @SerialName("totalNav") var totalNav: Float? = null,
    @SerialName("expenseRatio") var expenseRatio: Float? = null,
    @SerialName("benchmark") var benchmark: String? = null,
    @SerialName("inceptionDate") var inceptionDate: LocalDate? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("fundFamily") var fundFamily: String? = null,
    @SerialName("manager") var manager: String? = null,
    @SerialName("status") var status: String? = null,
    @SerialName("beta") var beta: Float? = null,
    @SerialName("deferredLoad") var deferredLoad: Float? = null,
    @SerialName("fee12b1") var fee12b1: Float? = null,
    @SerialName("frontLoad") var frontLoad: Float? = null,
    @SerialName("iraMinInvestment") var iraMinInvestment: Float? = null,
    @SerialName("isin") var isin: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("maxRedemptionFee") var maxRedemptionFee: Float? = null,
    @SerialName("standardMinInvestment") var standardMinInvestment: Float? = null,
    @SerialName("turnover") var turnover: Float? = null,
    @SerialName("seriesId") var seriesId: String? = null,
    @SerialName("seriesName") var seriesName: String? = null,
    @SerialName("classId") var classId: String? = null,
    @SerialName("className") var className: String? = null,
    @SerialName("sfdrClassification") var sfdrClassification: String? = null,
    @SerialName("currency") var currency: String? = null
)
