package com.example.rentalcars.web;

import com.example.rentalcars.service.OfferService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    private final OfferService offerService;

    public AccountController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("account/my-cars")
    public String myCars(Model model, @AuthenticationPrincipal UserDetails userDetails) {
            model.addAttribute("offers",offerService.getOffersByOwner(userDetails));
        return "my-cars";

    }
}
