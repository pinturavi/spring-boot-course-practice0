package com.example.limitsservice

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("limits-service")
class Configuration {
     var minimum: Int=0
     var maximum: Int=0
     lateinit var message:String
}