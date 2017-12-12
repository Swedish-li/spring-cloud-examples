package com.lrs.cloud.consumer.movie.controller;

import com.lrs.cloud.consumer.movie.model.User;
import com.lrs.cloud.consumer.movie.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MovieController {

    @Resource
   private UserService userService;

    @GetMapping("user/{id}")
    public User findUserById(@PathVariable Long id){
        return userService.findById(id);
    }
}
