package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property content Highlighted content
 * @property snippetId Location of the content in the rendered document
 * @property startOffset Start offset of highlighted content
 * @property endOffset End offset of highlighted content
 */
@Serializable
data class ExcerptResponse(
    @SerialName("content") var content: String? = null,
    @SerialName("snippetId") var snippetId: String? = null,
    @SerialName("startOffset") var startOffset: String? = null,
    @SerialName("endOffset") var endOffset: String? = null
)
