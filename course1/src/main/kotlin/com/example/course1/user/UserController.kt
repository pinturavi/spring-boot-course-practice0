package com.example.course1.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(val ur: UserRepository) {

    @GetMapping
    fun getAllUsers() = ur.findAll()
}