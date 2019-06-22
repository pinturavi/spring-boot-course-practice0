package com.example.currencyconversionservice

import com.fasterxml.jackson.annotation.JsonIgnore
import java.math.BigDecimal

data class ExchangeValue(
        @JsonIgnore
        var id:Long=0,

        var from :String="",

        var to:String="",

        var conversionMultiple: BigDecimal = BigDecimal.ZERO,
        var port:Int=0
)
