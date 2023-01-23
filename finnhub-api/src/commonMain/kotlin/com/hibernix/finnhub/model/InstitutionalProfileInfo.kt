package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property cik Investor's company CIK.
 * @property firmType Firm type.
 * @property manager Manager.
 * @property philosophy Investing philosophy.
 * @property profile Profile info.
 * @property profileImg Profile image.
 */
@Serializable
data class InstitutionalProfileInfo(
    @SerialName("cik") var cik: String? = null,
    @SerialName("firmType") var firmType: String? = null,
    @SerialName("manager") var manager: String? = null,
    @SerialName("philosophy") var philosophy: String? = null,
    @SerialName("profile") var profile: String? = null,
    @SerialName("profileImg") var profileImg: String? = null,
)
