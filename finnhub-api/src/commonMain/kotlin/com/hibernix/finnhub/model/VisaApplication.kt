package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property year Year.
 * @property quarter Quarter.
 * @property symbol Symbol.
 * @property caseNumber Case number.
 * @property caseStatus Case status.
 * @property receivedDate Received date.
 * @property visaClass Visa class.
 * @property jobTitle Job Title.
 * @property socCode SOC Code. A list of SOC code can be found [here](https://www.bls.gov/oes/current/oes_stru.htm).
 * @property fullTimePosition Full-time position flag.
 * @property beginDate Job's start date.
 * @property endDate Job's end date.
 * @property employerName Company's name.
 * @property worksiteAddress Worksite address.
 * @property worksiteCity Worksite city.
 * @property worksiteCounty Worksite county.
 * @property worksiteState Worksite state.
 * @property worksitePostalCode Worksite postal code.
 * @property wageRangeFrom Wage range from.
 * @property wageRangeTo Wage range to.
 * @property wageUnitOfPay Wage unit of pay.
 * @property wageLevel Wage level.
 * @property h1bDependent H1B dependent flag.
 */
@Serializable
data class VisaApplication(
    @SerialName("year") var year: Long? = null,
    @SerialName("quarter") var quarter: Long? = null,
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("caseNumber") var caseNumber: String? = null,
    @SerialName("caseStatus") var caseStatus: String? = null,
    @SerialName("receivedDate") var receivedDate: String? = null,
    @SerialName("visaClass") var visaClass: String? = null,
    @SerialName("jobTitle") var jobTitle: String? = null,
    @SerialName("socCode") var socCode: String? = null,
    @SerialName("fullTimePosition") var fullTimePosition: String? = null,
    @SerialName("beginDate") var beginDate: String? = null,
    @SerialName("endDate") var endDate: String? = null,
    @SerialName("employerName") var employerName: String? = null,
    @SerialName("worksiteAddress") var worksiteAddress: String? = null,
    @SerialName("worksiteCity") var worksiteCity: String? = null,
    @SerialName("worksiteCounty") var worksiteCounty: String? = null,
    @SerialName("worksiteState") var worksiteState: String? = null,
    @SerialName("worksitePostalCode") var worksitePostalCode: String? = null,
    @SerialName("wageRangeFrom") var wageRangeFrom: Float? = null,
    @SerialName("wageRangeTo") var wageRangeTo: Float? = null,
    @SerialName("wageUnitOfPay") var wageUnitOfPay: String? = null,
    @SerialName("wageLevel") var wageLevel: String? = null,
    @SerialName("h1bDependent") var h1bDependent: String? = null,
)
