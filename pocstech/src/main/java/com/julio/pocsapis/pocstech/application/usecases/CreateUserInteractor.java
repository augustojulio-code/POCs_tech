package com.julio.pocsapis.pocstech.application.usecases;

import com.julio.pocsapis.pocstech.application.gateways.UserGateway;
import com.julio.pocsapis.pocstech.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User creatUser(User user) {
        return userGateway.creatUser(user);
    }
}
