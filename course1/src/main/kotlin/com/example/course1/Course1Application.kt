package com.example.course1

import com.example.course1.user.Post
import com.example.course1.user.PostRepository
import com.example.course1.user.User
import com.example.course1.user.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Course1Application(val ur: UserRepository, val pr: PostRepository) {

    @Bean
    fun commandLineRunner() = CommandLineRunner {
        val ravi = User(id = 1000, name = "ravi")
        val pintu = User(id = 1001, name = "pintu")
        val vijay = User(id = 1002, name = "vijay")
        val post1 =  Post(id=2001, description = "post1", user=ravi)
        val post2 = Post(id=2001, description = "post2", user=pintu)
        val post3 = Post(id=2003, description = "post3", user=vijay)
        ur.saveAll(
                listOf(
                        ravi, pintu, vijay
                )
        )
        pr.saveAll(
                listOf(
                        post1, post2, post3
                )
        )

    }
}

fun main(args: Array<String>) {
    runApplication<Course1Application>(*args)
}
