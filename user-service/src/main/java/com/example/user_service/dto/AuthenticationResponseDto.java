package com.example.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AuthenticationResponseDto {
    private String message;
    private boolean success;
    private String token;

    public AuthenticationResponseDto(String message, boolean success, String token) {
        this.message = message;
        this.success = success;
        this.token = token;
    }
}
