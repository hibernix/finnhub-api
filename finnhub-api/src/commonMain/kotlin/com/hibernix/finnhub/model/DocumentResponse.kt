package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property documentId AlphaResearch internal document id.
 * @property title Title for this document.
 * @property hits Number of hit in this document
 * @property url Link to render this document
 * @property format Format of this document (can be html or pdf)
 * @property excerpts Highlighted excerpts for this document
 */
@Serializable
data class DocumentResponse(
    @SerialName("documentId") var documentId: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("hits") var hits: String? = null,
    @SerialName("url") var url: String? = null,
    @SerialName("format") var format: String? = null,
    @SerialName("excerpts") var excerpts: List<ExcerptResponse>? = null,
)
