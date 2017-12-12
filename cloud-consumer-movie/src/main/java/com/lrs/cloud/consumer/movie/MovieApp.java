package com.lrs.cloud.consumer.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients  // 启用feign进行远程调用
@SpringBootApplication
public class MovieApp {
    public static void main(String[] args) {
        SpringApplication.run(MovieApp.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
