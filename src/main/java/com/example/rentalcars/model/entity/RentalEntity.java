package com.example.rentalcars.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


import java.time.LocalDateTime;
@Entity
@Table(name = "rentals")
public class RentalEntity extends BaseEntity{

    @ManyToOne
    private OfferEntity vehicle;

    @ManyToOne
    private UserEntity customer;

    @Column(nullable = false)
    private LocalDateTime pickUpDateTime;

    @Column(nullable = false)
    private LocalDateTime dropOffDateTime;


    public OfferEntity getVehicle() {
        return vehicle;
    }

    public RentalEntity setVehicle(OfferEntity vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public UserEntity getCustomer() {
        return customer;
    }

    public RentalEntity setCustomer(UserEntity customer) {
        this.customer = customer;
        return this;
    }

    public LocalDateTime getPickUpDateTime() {
        return pickUpDateTime;
    }

    public RentalEntity setPickUpDateTime(LocalDateTime pickUpDateTime) {
        this.pickUpDateTime = pickUpDateTime;
        return this;
    }

    public LocalDateTime getDropOffDateTime() {
        return dropOffDateTime;
    }

    public RentalEntity setDropOffDateTime(LocalDateTime dropOffDateTime) {
        this.dropOffDateTime = dropOffDateTime;
        return this;
    }
}
