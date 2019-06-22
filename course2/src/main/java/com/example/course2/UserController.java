package com.example.course2;

import com.example.course2.model.Post;
import com.example.course2.model.User;
import com.example.course2.model.UserDto;
import com.example.course2.repository.PostRepository;
import com.example.course2.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private final UserRepository ur;
    private  final PostRepository pr;

    public UserController(UserRepository ur, PostRepository pr) {
        this.ur = ur;
        this.pr = pr;
    }

    @GetMapping("/api/users")
    public List<UserDto> getAllUsers() {
       List<User> users =  ur.findAll();
       return users.stream().map(UserDto::new).collect(Collectors.toList());
    }

    @GetMapping("/api/posts/{userId}")
    public List<Post> getPostsByUserId(@PathVariable("userId") Long userId){
        return pr.findByUserId(userId);
    }
}
