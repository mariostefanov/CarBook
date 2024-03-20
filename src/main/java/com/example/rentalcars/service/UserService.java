package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.UserRegisterDTO;
import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.model.entity.UserRoleEntity;
import com.example.rentalcars.model.enums.UserRoleEnum;
import com.example.rentalcars.model.mapper.UserMapper;
import com.example.rentalcars.repository.UserRepository;
import com.example.rentalcars.repository.UserRoleRepository;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class UserService {



    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    private final PasswordEncoder encoder;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsService userDetailsService;
    private final EmailService emailService;

    public UserService(UserRepository userRepository,
                       UserRoleRepository userRoleRepository,
                       PasswordEncoder encoder,
                       UserMapper userMapper,
                       PasswordEncoder passwordEncoder,
                       UserDetailsService userDetailsService,
                       EmailService emailService) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.encoder = encoder;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
        this.emailService = emailService;
    }



    public void registerAndLogin(UserRegisterDTO userRegisterDTO, Locale preferredLocale) {

        UserEntity newUser = userMapper.userDtoToUserEntity(userRegisterDTO);
        newUser.setPassword(encoder.encode(userRegisterDTO.getPassword()));

        userRepository.save(newUser);

        login(newUser);
        emailService.sendRegistrationEmail(newUser.getEmail(),
                newUser.getFirstName() + " " + newUser.getLastName(), preferredLocale);
    }

    public void login(UserEntity userEntity){
        UserDetails userDetails = userDetailsService.
                loadUserByUsername(userEntity.getEmail());

        Authentication auth = new UsernamePasswordAuthenticationToken(
                userDetails,
                userDetails.getPassword(),
                userDetails.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(auth);
    }







    public void init(){
        if (userRepository.count() == 0 && userRoleRepository.count() == 0){
            UserRoleEntity adminRole = new UserRoleEntity().setRoleEntity(UserRoleEnum.ADMIN);
            UserRoleEntity moderatorRole = new UserRoleEntity().setRoleEntity(UserRoleEnum.MODERATOR);

            adminRole = userRoleRepository.save(adminRole);
            moderatorRole = userRoleRepository.save(moderatorRole);

            initAdmin(List.of(adminRole,moderatorRole));
            initModerator(List.of(moderatorRole));
            initUser(List.of());
        }
    }

    private void initAdmin(List<UserRoleEntity> roles){
        UserEntity admin = new UserEntity()
                .setUserRoles(roles)
                .setFirstName("Admin")
                .setLastName("Adminov")
                .setEmail("admin@mail.com")
                .setPassword(passwordEncoder.encode("passs"));
        userRepository.save(admin);
    }

    private void initModerator(List<UserRoleEntity> roles){
        UserEntity moderator = new UserEntity()
                .setUserRoles(roles)
                .setFirstName("Moderator")
                .setLastName("Moderatorov")
                .setEmail("moderator@mail.com")
                .setPassword(passwordEncoder.encode("passs"));

        userRepository.save(moderator);
    }
    private void initUser(List<UserRoleEntity> roles){
        UserEntity user = new UserEntity()
                .setUserRoles(roles)
                .setFirstName("User")
                .setLastName("Userov")
                .setEmail("user@mail.com")
                .setPassword(passwordEncoder.encode("passs"));
        userRepository.save(user);
    }
}
