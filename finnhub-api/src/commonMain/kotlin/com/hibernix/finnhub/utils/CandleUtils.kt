package com.hibernix.finnhub.utils

import com.hibernix.finnhub.model.Candle
import com.hibernix.finnhub.model.Candles

/**
 * Converts slightly inconvenient response for historical candles into a more useful list of [Candle] items
 */
fun Candles.toCandleList(): List<Candle> = t?.mapIndexed { idx, time ->
    Candle(
        t = time,
        o = o?.get(idx),
        h = h?.get(idx),
        l = l?.get(idx),
        c = c?.get(idx),
        v = v?.get(idx),
    )
} ?: emptyList()
