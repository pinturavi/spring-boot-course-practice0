package com.example.currencyexchangeservice.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class ExchangeValue(
        @JsonIgnore
        @Id @GeneratedValue
        var id:Long=0,

        @Column(name = "currency_from")
        var from :String="",

        @Column(name = "currency_to")
        var to:String="",

        var conversionMultiple:BigDecimal= BigDecimal.ZERO,
        var port:Int=0
)
