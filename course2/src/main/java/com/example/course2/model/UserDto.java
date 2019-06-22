package com.example.course2.model;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserDto {

    private String name;
    private List<String> posts;

    public UserDto(User user){
        this.name = user.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(List<String> posts) {
        this.posts = posts;
    }
}
