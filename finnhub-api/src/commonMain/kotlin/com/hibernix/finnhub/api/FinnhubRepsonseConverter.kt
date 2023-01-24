package com.hibernix.finnhub.api

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.converter.SuspendResponseConverter
import de.jensklingenberg.ktorfit.internal.TypeData
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.util.reflect.TypeInfo
import kotlinx.serialization.Serializable

/**
 * Takes care of handling specific error responses from finnhub server and transforms them into [FinnhubApiException]
 * with the received error message. If the error cannot be parsed, the whole response will be returned in the message
 * as text.
 */
class FinnhubRepsonseConverter : SuspendResponseConverter {

    override fun supportedType(typeData: TypeData, isSuspend: Boolean): Boolean = true

    override suspend fun <RequestType> wrapSuspendResponse(
        typeData: TypeData,
        requestFunction: suspend () -> Pair<TypeInfo, HttpResponse>,
        ktorfit: Ktorfit,
    ): Any {
        val (info, response) = requestFunction()
        if (response.status.isSuccess()) {
            return response.body<Any>(info)
        } else {
            try {
                val error = response.body<FinnhubApiError>()
                throw FinnhubApiException(response.status.value, error.error)
            } catch (error: Throwable) {
                throw FinnhubApiException(response.status.value, response.bodyAsText())
            }
        }
    }
}

@Serializable
data class FinnhubApiError(val error: String)
