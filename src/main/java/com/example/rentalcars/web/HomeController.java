package com.example.rentalcars.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/users/login")
    public String login(){
        return "auth-login";
    }

    @GetMapping("/users/register")
        public String register(){
            return "auth-register";
        }
    }


