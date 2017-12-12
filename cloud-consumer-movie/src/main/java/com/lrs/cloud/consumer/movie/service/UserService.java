package com.lrs.cloud.consumer.movie.service;

import com.lrs.cloud.consumer.movie.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cloud-provider-user")
public interface UserService {

    @RequestMapping("user/{id}")
    public User findById(@PathVariable("id") Long id);
}
