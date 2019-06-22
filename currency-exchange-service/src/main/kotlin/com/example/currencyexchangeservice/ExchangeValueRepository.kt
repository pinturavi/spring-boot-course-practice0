package com.example.currencyexchangeservice

import com.example.currencyexchangeservice.model.ExchangeValue
import org.springframework.data.jpa.repository.JpaRepository
import java.math.BigDecimal
import java.util.*

interface ExchangeValueRepository:JpaRepository<ExchangeValue, Long>{
   fun findByFromAndTo(from:String, to:String): Optional<ExchangeValue>
}