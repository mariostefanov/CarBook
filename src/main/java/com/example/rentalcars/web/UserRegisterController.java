package com.example.rentalcars.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserRegisterController {

    @GetMapping("/register")
    public String register(){
        return "auth-register";
    }

    //TODO Post-redirect-GET
}
