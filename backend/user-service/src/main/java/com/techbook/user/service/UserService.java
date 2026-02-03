package com.techbook.user.service;

import com.techbook.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return List.of(
                new User(1L, "Naveen", "naveen@example.com"),
                new User(2L, "TechBook Admin", "admin@techbook.com")
        );
    }
}
