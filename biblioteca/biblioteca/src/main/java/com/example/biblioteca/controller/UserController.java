package com.example.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.service.UserService;


@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired

    private UserService userService;

    @GetMapping("/oi")
    public String oi(){
        return userService.dizerOI();
    }
}
