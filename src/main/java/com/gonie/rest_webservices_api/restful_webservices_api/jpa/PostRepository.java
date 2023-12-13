package com.gonie.rest_webservices_api.restful_webservices_api.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonie.rest_webservices_api.restful_webservices_api.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
