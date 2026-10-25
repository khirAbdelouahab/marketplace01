package com.example.user_service.dto;


import com.example.user_service.enums.ROLE;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequestDto {
    @NotBlank(message = "name is required")
    @Size(min = 6 , message = "name must be at least 6 characters long")
    @Size(max = 50 , message = "name is too long")
    private String name;
    @NotBlank(message = "email is required")
    @Email(message = "Email format is invalid")
    private String email;
    @NotBlank(message = "password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Size(max = 128, message = "Password is too long")
    private String password;
    @NotNull
    private ROLE role;
    private String avatar;

    public String getEmail() {
        return this.email;
    }
}
