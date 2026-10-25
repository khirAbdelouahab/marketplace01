package com.example.user_service.mapper;

import com.example.user_service.dto.RegisterRequestDto;
import com.example.user_service.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(RegisterRequestDto user);

}
