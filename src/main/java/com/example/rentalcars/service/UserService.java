package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.UserLoginDTO;
import com.example.rentalcars.model.dto.UserRegisterDTO;
import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.repository.UserRepository;
import com.example.rentalcars.user.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserService {

    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;
    private final CurrentUser currentUser;
    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepository, CurrentUser currentUser, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.encoder = encoder;
    }

    public boolean login(UserLoginDTO userLoginDto) {
        Optional<UserEntity> userOpt = userRepository.findByEmail(userLoginDto.getEmail());

        if (userOpt.isEmpty()) {
            LOGGER.info("User with name [{}] not found.", userLoginDto.getEmail());
            return false;
        }

        var rawPassword = userLoginDto.getPassword();
        var encodedPassword = userOpt.get().getPassword();

        boolean success = encoder.matches(rawPassword,encodedPassword);

        if (success) {
            login(userOpt.get());
        } else {
            logout();
        }

        return success;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO){

        UserEntity newUser = new UserEntity().
                setFirstName(userRegisterDTO.getFirstName()).
                setLastName(userRegisterDTO.getLastName()).
                setEmail(userRegisterDTO.getEmail()).
                setBirthDate(LocalDate.parse(userRegisterDTO.getBirthdate())).
                setPassword(encoder.encode(userRegisterDTO.getPassword()));

        newUser = userRepository.save(newUser);

        login(newUser);
    }



    private void login(UserEntity userEntity) {
        currentUser.setLoggedIn(true).setName(userEntity.getFirstName() + " " + userEntity.getLastName());
    }

    public void logout() {
        currentUser.clear();
    }


    public void register(UserRegisterDTO registerDTO) {
//            userRepository.save
    }
}
