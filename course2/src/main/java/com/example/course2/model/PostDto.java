package com.example.course2.model;

public class PostDto {

    private String description;

    private User user;


    public PostDto(String description, User user) {
        this.description = description;
        this.user = user;
    }

    public PostDto(Post post) {
        this.description=post.getDescription();
        //this.user = post.getUser();
    }
}
