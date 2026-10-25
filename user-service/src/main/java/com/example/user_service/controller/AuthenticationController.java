package com.example.user_service.controller;


import com.example.user_service.dto.AuthenticationRequestDto;
import com.example.user_service.dto.AuthenticationResponseDto;
import com.example.user_service.dto.RegisterRequestDto;
import com.example.user_service.exception.UserAlreadyExistsException;
import com.example.user_service.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/users")
public class AuthenticationController {

    private final UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody AuthenticationRequestDto authentication) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponseDto> register(@Valid @RequestBody RegisterRequestDto registerRequestDto) {
        this.userService.create(registerRequestDto);
        return ResponseEntity.ok().body(new AuthenticationResponseDto("registration succeded", true, "generated token"));
    }
}
