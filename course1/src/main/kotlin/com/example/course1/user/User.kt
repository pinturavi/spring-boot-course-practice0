package com.example.course1.user

import javax.persistence.*

@Entity
data class User(
        @Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var name: String="",
        @OneToMany(mappedBy = "user")
        var posts:List<Post> = listOf()

) {
        override fun toString(): String {
                return "User(id=$id, name='$name')"
        }
}