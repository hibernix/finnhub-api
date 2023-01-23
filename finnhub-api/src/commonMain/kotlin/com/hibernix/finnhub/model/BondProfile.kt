package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property isin ISIN.
 * @property cusip Cusip.
 * @property figi FIGI.
 * @property coupon Coupon.
 * @property maturityDate Period.
 * @property offeringPrice Offering price.
 * @property issueDate Issue date.
 * @property bondType Bond type.
 * @property debtType Bond type.
 * @property industryGroup Industry.
 * @property industrySubGroup Sub-Industry.
 * @property asset Asset.
 * @property assetType Asset.
 * @property datedDate Dated date.
 * @property firstCouponDate First coupon date.
 * @property originalOffering Offering amount.
 * @property amountOutstanding Outstanding amount.
 * @property paymentFrequency Payment frequency.
 * @property securityLevel Security level.
 * @property callable Callable.
 * @property couponType Coupon type.
 */
@Serializable
data class BondProfile(
    @SerialName("isin") var isin: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("figi") var figi: String? = null,
    @SerialName("coupon") var coupon: Float? = null,
    @SerialName("maturityDate") var maturityDate: String? = null,
    @SerialName("offeringPrice") var offeringPrice: Float? = null,
    @SerialName("issueDate") var issueDate: String? = null,
    @SerialName("bondType") var bondType: String? = null,
    @SerialName("debtType") var debtType: String? = null,
    @SerialName("industryGroup") var industryGroup: String? = null,
    @SerialName("industrySubGroup") var industrySubGroup: String? = null,
    @SerialName("asset") var asset: String? = null,
    @SerialName("assetType") var assetType: String? = null,
    @SerialName("datedDate") var datedDate: String? = null,
    @SerialName("firstCouponDate") var firstCouponDate: String? = null,
    @SerialName("originalOffering") var originalOffering: Float? = null,
    @SerialName("amountOutstanding") var amountOutstanding: Float? = null,
    @SerialName("paymentFrequency") var paymentFrequency: String? = null,
    @SerialName("securityLevel") var securityLevel: String? = null,
    @SerialName("callable") var callable: Boolean? = null,
    @SerialName("couponType") var couponType: String? = null,
)
