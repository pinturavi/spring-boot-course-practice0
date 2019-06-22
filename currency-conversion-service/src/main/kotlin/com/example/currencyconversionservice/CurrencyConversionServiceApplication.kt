package com.example.currencyconversionservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
class CurrencyConversionServiceApplication{
	@Bean
	fun restTemplate() = RestTemplate()
}

fun main(args: Array<String>) {
	runApplication<CurrencyConversionServiceApplication>(*args)
}
