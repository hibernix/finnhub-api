package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property gradeTime Upgrade/downgrade time in UNIX timestamp.
 * @property fromGrade From grade.
 * @property toGrade To grade.
 * @property company Company/analyst who did the upgrade/downgrade.
 * @property action Action can take any of the following values:
 * *up(upgrade), down(downgrade), main(maintains), init(initiate), reit(reiterate)*.
 */
@Serializable
data class UpgradeDowngrade(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("gradeTime") var gradeTime: Long? = null,
    @SerialName("fromGrade") var fromGrade: String? = null,
    @SerialName("toGrade") var toGrade: String? = null,
    @SerialName("company") var company: String? = null,
    @SerialName("action") var action: String? = null
)
