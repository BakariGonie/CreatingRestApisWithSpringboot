package com.gonie.rest_webservices_api.restful_webservices_api.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonie.rest_webservices_api.restful_webservices_api.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
