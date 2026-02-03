package com.techbook.auth.service;

import com.techbook.auth.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String authenticate(String username, String password)  {
        // Dummy validation for now
        if ("admin".equals(username) && "password".equals(password))  {
            return JwtUtil.generateToken(username);
        }
        throw new IllegalArgumentException("Invalid credentials");

    }
}
