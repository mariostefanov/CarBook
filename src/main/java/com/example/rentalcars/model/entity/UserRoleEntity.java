package com.example.rentalcars.model.entity;

import com.example.rentalcars.model.enums.UserRoleEnum;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRoleEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRoleEnum roleEntity;

    public UserRoleEnum getRoleEntity() {
        return roleEntity;
    }

    public UserRoleEntity setRoleEntity(UserRoleEnum roleEntity) {
        this.roleEntity = roleEntity;
        return this;
    }
}
