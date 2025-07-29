package com.example.preprojopenapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PreProjOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PreProjOpenApiApplication.class, args);
    }

}
