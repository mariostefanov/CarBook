package com.example.rentalcars.repository;

import com.example.rentalcars.model.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<Long, UserRoleEntity> {
}
