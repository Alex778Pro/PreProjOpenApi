package com.example.preprojopenapi.service;

import com.example.preprojopenapi.client.UserClient;
import com.example.preprojopenapi.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public List<UserDTO> getAllUsers() {
        return userClient.getAllUsers();
    }
}
