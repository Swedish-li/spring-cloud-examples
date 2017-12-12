package com.lrs.cloud.provider.user.controller;

import com.lrs.cloud.provider.user.model.User;
import com.lrs.cloud.provider.user.repositoy.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
        return  this.userRepository.findOne(id);
    }
}
