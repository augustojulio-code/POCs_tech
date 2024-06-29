package com.julio.pocsapis.pocstech.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.julio.pocsapis.pocstech.application.gateways.UserGateway;
import com.julio.pocsapis.pocstech.application.usecases.CreateUserInteractor;
import com.julio.pocsapis.pocstech.infrastructure.controllers.UserDTOMapper;
import com.julio.pocsapis.pocstech.infrastructure.gateways.UserEntityMapper;
import com.julio.pocsapis.pocstech.infrastructure.gateways.UserRepositoryGateways;
import com.julio.pocsapis.pocstech.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateways(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }

}
