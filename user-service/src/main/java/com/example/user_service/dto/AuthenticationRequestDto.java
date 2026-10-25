package com.example.user_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthenticationRequestDto {
    @NotBlank(message = "email is required")
    @Email(message = "Email format is invalid")
    public String email;
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be over 8 characters")
    @Size(max = 128, message = "Password is too long")
    public String password;
}
