package com.example.course1.user

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository:JpaRepository<Post, Long> {
}