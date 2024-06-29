package com.julio.pocsapis.pocstech.infrastructure.gateways;

import com.julio.pocsapis.pocstech.application.gateways.UserGateway;
import com.julio.pocsapis.pocstech.domain.entity.User;
import com.julio.pocsapis.pocstech.infrastructure.persistence.UserEntity;
import com.julio.pocsapis.pocstech.infrastructure.persistence.UserRepository;

public class UserRepositoryGateways implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateways(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User creatUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }

}
