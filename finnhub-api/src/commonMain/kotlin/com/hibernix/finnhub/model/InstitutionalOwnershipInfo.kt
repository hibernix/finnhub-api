package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property cik Investor's company CIK.
 * @property name Firm's name.
 * @property putCall ```put``` or ```call``` for options.
 * @property change Number of shares change.
 * @property noVoting Number of shares with no voting rights.
 * @property percentage Percentage of portfolio.
 * @property share News score.
 * @property sharedVoting Number of shares with shared voting rights.
 * @property soleVoting Number of shares with sole voting rights.
 * @property value Position value.
 */
@Serializable
data class InstitutionalOwnershipInfo(
    @SerialName("cik") var cik: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("putCall") var putCall: String? = null,
    @SerialName("change") var change: Float? = null,
    @SerialName("noVoting") var noVoting: Float? = null,
    @SerialName("percentage") var percentage: Float? = null,
    @SerialName("share") var share: Float? = null,
    @SerialName("sharedVoting") var sharedVoting: Float? = null,
    @SerialName("soleVoting") var soleVoting: Float? = null,
    @SerialName("value") var value: Float? = null,
)
