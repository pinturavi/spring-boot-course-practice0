package com.example.currencyexchangeservice

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.client.RestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CurrencyExchangeServiceApplicationTests(var restTemplate: RestTemplate) {

	@Test
	fun contextLoads() {
	}

}
