package com.example.course2;

import com.example.course2.model.Post;
import com.example.course2.model.User;
import com.example.course2.repository.PostRepository;
import com.example.course2.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Course2Application {

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository ur, PostRepository pr) {
        return args -> {
            User ravi = new User("ravi");
            User pintu = new User("pintu");
            User vijay = new User("vijay");
            Post post1 = new Post("post1", ravi);
            Post post2 = new Post("post2", pintu);
            Post post3 = new Post("post3", vijay);
            ur.saveAll(Arrays.asList(ravi, pintu, vijay));
            pr.saveAll(Arrays.asList(post2, post3));
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(Course2Application.class, args);
    }

}


