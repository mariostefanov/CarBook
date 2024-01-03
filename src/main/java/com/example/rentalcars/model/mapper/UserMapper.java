package com.example.rentalcars.model.mapper;


import com.example.rentalcars.model.dto.UserRegisterDTO;
import com.example.rentalcars.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "active", constant = "true")
    UserEntity userDtoToUserEntity(UserRegisterDTO userRegisterDTO);
}
