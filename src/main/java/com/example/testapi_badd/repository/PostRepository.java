package com.example.testapi_badd.repository;

import com.example.testapi_badd.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
