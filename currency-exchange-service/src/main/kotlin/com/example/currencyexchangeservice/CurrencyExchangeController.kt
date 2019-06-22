package com.example.currencyexchangeservice

import com.example.currencyexchangeservice.model.ExchangeValue
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.lang.Integer.parseInt

@RestController
class CurrencyExchangeController(val env:Environment, val er:ExchangeValueRepository) {

    @GetMapping("/currency-exchange-service/from/{from}/to/{to}")
    fun getExchange(@PathVariable("from") from: String, @PathVariable("to") to: String):  ExchangeValue{
        return er.findByFromAndTo(from, to).map {
            it.port= parseInt(env.getProperty("local.server.port"))
            it
        }.orElseThrow { NotFoundException("There is no value found for the given from and to currencies.") }
    }

}