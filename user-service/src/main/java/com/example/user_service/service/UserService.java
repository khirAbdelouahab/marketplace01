package com.example.user_service.service;

import com.example.user_service.dto.RegisterRequestDto;
import com.example.user_service.exception.UserAlreadyExistsException;
import com.example.user_service.exception.UserNotExistsException;
import com.example.user_service.mapper.UserMapper;
import com.example.user_service.model.User;
import com.example.user_service.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void create(RegisterRequestDto registerRequestDto) {
        User user = this.Exists(registerRequestDto.getEmail());
        if (user == null) {
            log.info("before mapping");
            user = this.userMapper.toEntity(registerRequestDto);
            log.info("after mapping");
            log.info("user will be created: { name : " + user.getName() + "}");
            this.userRepository.save(user);
        } else {
            throw new UserAlreadyExistsException("User with email '"+ registerRequestDto.getEmail() +"' already exists");
        }
    }

    public User find(String email) {
       return this.userRepository.findByEmail(email).orElseThrow(
               () -> new UserNotExistsException("User with email '" + email + "' not found")
       );
    }

    private User Exists(String email) {
        return this.userRepository.findByEmail(email).orElse(null);
    }


}
