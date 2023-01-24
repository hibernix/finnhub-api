package com.hibernix.finnhub.websocket

/**
 * Exception thrown, when an error frame is received from finnhub server.
 * @property msg Message received in error frame
 */
class FinnhubWebsocketException(message: String) : Exception(message)
