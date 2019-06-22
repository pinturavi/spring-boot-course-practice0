package com.example.currencyexchangeservice

import java.time.LocalDateTime

data class ExceptionResponse(var timeStamp:LocalDateTime=LocalDateTime.now(), val message:String?, val details:String?)