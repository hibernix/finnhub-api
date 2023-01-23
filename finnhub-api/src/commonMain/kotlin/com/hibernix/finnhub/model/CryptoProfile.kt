package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property longName Long name.
 * @property name Name.
 * @property description Description.
 * @property website Project's website.
 * @property marketCap Market capitalization.
 * @property totalSupply Total supply.
 * @property maxSupply Max supply.
 * @property circulatingSupply Circulating supply.
 * @property logo Logo image.
 * @property launchDate Launch date.
 * @property proofType Proof type.
 */
@Serializable
data class CryptoProfile(
    @SerialName("longName") var longName: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("website") var website: String? = null,
    @SerialName("marketCap") var marketCap: Float? = null,
    @SerialName("totalSupply") var totalSupply: Float? = null,
    @SerialName("maxSupply") var maxSupply: Float? = null,
    @SerialName("circulatingSupply") var circulatingSupply: Float? = null,
    @SerialName("logo") var logo: String? = null,
    @SerialName("launchDate") var launchDate: String? = null,
    @SerialName("proofType") var proofType: String? = null,
)
