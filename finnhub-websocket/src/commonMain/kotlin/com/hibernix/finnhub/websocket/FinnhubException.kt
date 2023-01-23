package com.hibernix.finnhub.websocket

/**
 * Exception thrown, when an error frame is received from finnhub server.
 * @param msg Message received in error frame
 */
class FinnhubException(msg: String) : Exception(msg)
