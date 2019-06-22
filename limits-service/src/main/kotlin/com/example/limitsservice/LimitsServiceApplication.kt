package com.example.limitsservice

import org.hibernate.annotations.Filter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType

@SpringBootApplication
@EnableConfigurationProperties(Configuration::class)
class LimitsServiceApplication

fun main(args: Array<String>) {
	runApplication<LimitsServiceApplication>(*args)
}
