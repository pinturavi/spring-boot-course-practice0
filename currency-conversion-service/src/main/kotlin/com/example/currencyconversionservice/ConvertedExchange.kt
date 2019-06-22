package com.example.currencyconversionservice

import java.math.BigDecimal
import java.math.BigDecimal.ZERO

data class ConvertedExchange(

        var from: String = "",

        var to: String = "",

        var conversionMultiple: BigDecimal? = ZERO,
        var qty: Int = 0,
        var port: Int = 0,
        var convertedValue: BigDecimal? = ZERO
)
