package com.example.rentalcars.init;

import com.example.rentalcars.service.OfferService;
import com.example.rentalcars.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppInit implements CommandLineRunner {

    private final UserService userService;


    public AppInit(UserService userService, OfferService offerService) {
        this.userService = userService;

    }

    @Override
    public void run(String... args) throws Exception {
       // userService.init();

    }
}
