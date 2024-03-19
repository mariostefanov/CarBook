package com.example.rentalcars.repository;

import com.example.rentalcars.model.entity.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity, UUID> {
    List<OfferEntity> findByOwnerEmail(String email);
}
