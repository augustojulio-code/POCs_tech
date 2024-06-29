package com.julio.pocsapis.pocstech.infrastructure.controllers;

import com.julio.pocsapis.pocstech.domain.entity.User;

public class UserDTOMapper {

    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.name(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.name(), request.password(), request.email());
    }
}
