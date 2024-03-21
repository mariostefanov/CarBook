package com.example.rentalcars.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {



    @GetMapping("/login")
    public String login() {
        return "auth-login";
    }


    @PostMapping("/login-error")
    public String onFailedLogin(
            @ModelAttribute("email") String email,
            RedirectAttributes redirectAttributes
    ){
        redirectAttributes.addFlashAttribute("email", email);
        redirectAttributes.addFlashAttribute("bad_credentials", true);

        return "redirect:/users/login";

    }


}
