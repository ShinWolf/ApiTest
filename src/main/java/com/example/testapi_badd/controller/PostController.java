package com.example.testapi_badd.controller;

import com.example.testapi_badd.entity.Post;
import com.example.testapi_badd.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/post")
public class PostController {

    private final PostService postService;

    @PostMapping(path = "/create")
    public Post creation(Post p) {
        return this.postService.creationPost(p);
    }

    @GetMapping(path = "/listPosts")
    public List<Post> postList(Post p) {
        return this.postService.getListPosts();
    }
}
