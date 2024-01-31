package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllUsers(){
        return "users/showAll";
    }
}
