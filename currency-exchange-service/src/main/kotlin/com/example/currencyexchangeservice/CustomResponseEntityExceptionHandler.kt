package com.example.currencyexchangeservice

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.context.request.WebRequest

@RestController
@ControllerAdvice
class CustomResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException::class)
    fun notFoundExceptionHandler(exceptin:NotFoundException, request:WebRequest): ResponseEntity<ExceptionResponse> {
        val exceptionResponse = ExceptionResponse(message="exceptin occured.", details = request.getDescription(false))
        return ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}