package com.example.preprojopenapi.client;

import com.example.preprojopenapi.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "userClient", url = "http://localhost:8081")
public interface UserClient {

    @GetMapping("/users")
    List<UserDTO> getAllUsers();
}
