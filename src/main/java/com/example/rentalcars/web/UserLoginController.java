package com.example.rentalcars.web;

import com.example.rentalcars.model.dto.UserLoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class UserLoginController {
    @GetMapping("/users/login")
    public String login(){
        return "auth-login";
    }

    @PostMapping("/users/login")
    public String login(UserLoginDto userLoginDto){
        System.out.println(userLoginDto);
        return "redirect:/";
    }

    @GetMapping("/users/register")
    public String register(){
        return "auth-register";
    }
}
