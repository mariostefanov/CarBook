package com.example.rentalcars.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfferController {

    @GetMapping("/offers/add")
    public String addOffer() {
        return "offer-add";
    }
}
