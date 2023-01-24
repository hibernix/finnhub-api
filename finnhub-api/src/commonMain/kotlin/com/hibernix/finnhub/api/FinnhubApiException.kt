package com.hibernix.finnhub.api

/**
 * Represents error received from finnhub server.
 * @property code error code of the response
 * @property message contains the error message from the server, or the whole error response, if the format cannot
 * be recognized.
 */
class FinnhubApiException(val code: Int, message: String) : Exception(message)
