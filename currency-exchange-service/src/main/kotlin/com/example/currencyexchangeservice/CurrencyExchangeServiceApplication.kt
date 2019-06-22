package com.example.currencyexchangeservice

import com.example.currencyexchangeservice.model.ExchangeValue
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import java.math.BigDecimal

@SpringBootApplication
@EnableDiscoveryClient
class CurrencyExchangeServiceApplication(val er: ExchangeValueRepository) {

    @Bean
    fun commandLinerunner() = CommandLineRunner {
        er.saveAll(
                listOf(
                        ExchangeValue(from ="EUR", to="INR", conversionMultiple = BigDecimal.valueOf(87)),
                        ExchangeValue(from ="USD", to="INR", conversionMultiple = BigDecimal.valueOf(87)),
                        ExchangeValue(from="SGD", to="INR", conversionMultiple = BigDecimal.valueOf(65))

                )
        )
    }
}

fun main(args: Array<String>) {
    runApplication<CurrencyExchangeServiceApplication>(*args)
}
