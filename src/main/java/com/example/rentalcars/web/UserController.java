package com.example.rentalcars.web;

import com.example.rentalcars.model.dto.UserLoginDTO;
import com.example.rentalcars.model.dto.UserRegisterDTO;
import com.example.rentalcars.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "auth-login";
    }

    @PostMapping("/login")
    public String login(UserLoginDTO userLoginDto){
        userService.login(userLoginDto);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register() {
        return "auth-register";
    }

    //TODO Post-redirect-GET

    @PostMapping("/register")
    public String register(UserRegisterDTO registerDTO) {
        userService.registerAndLogin(registerDTO);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(){
        userService.logout();
        return "redirect:/";
    }

}
