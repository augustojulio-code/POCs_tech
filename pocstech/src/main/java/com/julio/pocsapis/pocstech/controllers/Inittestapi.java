package com.julio.pocsapis.pocstech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Inittestapi {

    @GetMapping("ola")
    public String olaImbecil() {
        return "Olá imbecil";
    }
}
