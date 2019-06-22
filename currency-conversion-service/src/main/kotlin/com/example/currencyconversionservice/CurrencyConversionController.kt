package com.example.currencyconversionservice

import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.lang.Integer.parseInt

@RestController
class CurrencyConversionController(val rt:RestTemplate, val er:ExchangeReader, val env:Environment) {

    @GetMapping("/currency-converter/from/{from}/to/{to}/qty/{qty}")
    fun getConvertedValue(@PathVariable("from") from:String, @PathVariable("to") to:String, @PathVariable("qty") qty:Int):ConvertedExchange?{
        val uriVariables = hashMapOf("from" to from, "to" to to, "qty" to qty)
        /*val exchangeValue = rt.getForEntity("http://localhost:8000/currency-exchange-service/from/{from}/to/{to}", ConvertedExchange::class.java, uriVariables)
                .body*/

        val exchangeValue = er.getExchange(from, to)
        if (exchangeValue != null) {
            return ConvertedExchange(
                    from = from,
                    to =to,
                    qty = qty,
                    conversionMultiple = exchangeValue?.conversionMultiple,
                    convertedValue = exchangeValue.conversionMultiple?.times(exchangeValue?.conversionMultiple!!),
                    port = exchangeValue.port
            )
        }
        return null
    }
}

@FeignClient("currency-exchagne-service")
@RibbonClient("currency-exchagne-service")
interface ExchangeReader {
    @GetMapping("/currency-exchange-service/from/{from}/to/{to}")
    fun getExchange(@PathVariable("from") from: String, @PathVariable("to") to: String): ExchangeValue
}
