package com.julio.pocsapis.pocstech.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julio.pocsapis.pocstech.application.usecases.CreateUserInteractor;
import com.julio.pocsapis.pocstech.domain.entity.User;

@RestController
@RequestMapping("user")
public class UserController {
    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest request) {
        User useBusinessObj = userDTOMapper.toUser(request);
        User user = createUserInteractor.creatUser(useBusinessObj);
        return userDTOMapper.toResponse(user);
    }
}
