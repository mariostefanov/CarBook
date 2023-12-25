package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.UserLoginDto;
import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.repository.UserRepository;
import com.example.rentalcars.user.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private UserRepository userRepository;
    private final CurrentUser currentUser;

    public UserService(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    public boolean login(UserLoginDto userLoginDto){
        Optional<UserEntity> userOpt = userRepository.findByEmail(userLoginDto.getEmail());

        if (userOpt.isEmpty()) {
            LOGGER.info("User with name [{}] not found.",userLoginDto.getEmail());
            return false;
        }

        boolean success = userOpt.get().getPassword().equals(userLoginDto.getPassword());

        if (success){
            //
            login(userOpt.get());
        } else {
            logout();
        }

        return success;
    }


    private void login(UserEntity userEntity){
        currentUser.setLoggedIn(true).setName(userEntity.getFirstName() + " " + userEntity.getLastName());
    }

    public void logout(){
        currentUser.clear();
    }


}
