package com.julio.pocsapis.pocstech.infrastructure.controllers;

public record CreateUserRequest(String name, String password, String email) {
}
