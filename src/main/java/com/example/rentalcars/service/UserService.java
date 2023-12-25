package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.UserLoginDto;
import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(UserLoginDto userLoginDto){
        Optional<UserEntity> userOpt = userRepository.findByEmail(userLoginDto.getEmail());

        if (userOpt.isEmpty()) {
            LOGGER.info("User with name [{}] not found.",userLoginDto.getEmail());
            return false;
        }

        return userOpt.get().getPassword().equals(userLoginDto.getPassword());
    }


}
