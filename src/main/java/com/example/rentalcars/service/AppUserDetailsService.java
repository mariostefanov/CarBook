package com.example.rentalcars.service;

import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.model.entity.UserRoleEntity;
import com.example.rentalcars.model.user.AppUserDetails;
import com.example.rentalcars.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.stream.Collectors;

public class AppUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public AppUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AppUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        return  userRepository.
                findByEmail(email).
                map(this::map).
                orElseThrow(() -> new UsernameNotFoundException("User with email " + email + " not found." ));
                
        

    }

    private AppUserDetails map(UserEntity userEntity) {

        return new AppUserDetails(
                userEntity.getPassword(),
                userEntity.getEmail(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getUserRoles().
                stream().
                map(this::map).
                toList()
        );

    }

    private GrantedAuthority map(UserRoleEntity userRole){
        return new SimpleGrantedAuthority("ROLE_" +
                userRole.
                        getRoleEntity().
                         name());

    }
}
