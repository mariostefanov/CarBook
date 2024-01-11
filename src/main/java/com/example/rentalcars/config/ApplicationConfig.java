package com.example.rentalcars.config;

import com.example.rentalcars.repository.UserRepository;
import com.example.rentalcars.service.AppUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApplicationConfig {

    @Bean
    public PasswordEncoder defaultsForSpringSecurity_v5_8(){
        return new Pbkdf2PasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity){
        //todo
        return null;
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository) {

        //null
        return new AppUserDetailsService(userRepository);
    }
}
