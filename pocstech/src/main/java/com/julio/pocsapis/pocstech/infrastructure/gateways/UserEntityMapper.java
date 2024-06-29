package com.julio.pocsapis.pocstech.infrastructure.gateways;

import com.julio.pocsapis.pocstech.domain.entity.User;
import com.julio.pocsapis.pocstech.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.name(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getPassword(), userEntity.getEmail());
    }
}
