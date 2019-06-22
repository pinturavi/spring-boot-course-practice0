package com.example.limitsservice.controller

import com.example.limitsservice.Configuration
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
class LimitsController(val configuration:Configuration) {

    @Value("\${message}")
    lateinit var message:String

    @GetMapping("/limits")
    fun getMinMax() = mapOf("minimun" to configuration.minimum, "maximum" to configuration.maximum)

    @GetMapping("/message")
    fun retrieveMessage() = configuration.message
}