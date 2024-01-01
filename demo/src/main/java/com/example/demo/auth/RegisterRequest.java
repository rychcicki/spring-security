package com.example.demo.auth;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
