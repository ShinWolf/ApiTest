package com.example.testapi_badd.service;

import com.example.testapi_badd.entity.Post;
import com.example.testapi_badd.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post creationPost(Post p) {
        return this.postRepository.save(p);
    }

    public List<Post> getListPosts() {
        return this.postRepository.findAll();
    }
}
