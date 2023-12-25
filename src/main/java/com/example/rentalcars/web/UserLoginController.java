package com.example.rentalcars.web;

import com.example.rentalcars.model.dto.UserLoginDto;
import com.example.rentalcars.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class UserLoginController {

    private final UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/login")
    public String login(){
        return "auth-login";
    }

    @PostMapping("/users/login")
    public String login(UserLoginDto userLoginDto){
        System.out.println("User is logged: " + userService.login(userLoginDto));
        return "redirect:/";
    }

    @GetMapping("/users/register")
    public String register(){
        return "auth-register";
    }
}
