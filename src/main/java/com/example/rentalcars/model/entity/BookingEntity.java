package com.example.rentalcars.model.entity;

import com.example.rentalcars.model.enums.RentStatus;
import jakarta.persistence.*;


import java.time.LocalDateTime;
@Entity
@Table(name = "bookings")
public class BookingEntity extends BaseEntity{

    @ManyToOne
    private OfferEntity offer;

    @ManyToOne
    private UserEntity customer;

    @Column(nullable = false)
    private LocalDateTime pickUpDateTime;

    @Column(nullable = false)
    private LocalDateTime dropOffDateTime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RentStatus rentStatus;

    private int totalDays;


    public OfferEntity getOffer() {
        return offer;
    }

    public BookingEntity setOffer(OfferEntity offer) {
        this.offer = offer;
        return this;
    }

    public UserEntity getCustomer() {
        return customer;
    }

    public BookingEntity setCustomer(UserEntity customer) {
        this.customer = customer;
        return this;
    }

    public LocalDateTime getPickUpDateTime() {
        return pickUpDateTime;
    }

    public BookingEntity setPickUpDateTime(LocalDateTime pickUpDateTime) {
        this.pickUpDateTime = pickUpDateTime;
        return this;
    }

    public LocalDateTime getDropOffDateTime() {
        return dropOffDateTime;
    }

    public BookingEntity setDropOffDateTime(LocalDateTime dropOffDateTime) {
        this.dropOffDateTime = dropOffDateTime;
        return this;
    }

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public BookingEntity setRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
        return this;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public BookingEntity setTotalDays(int totalDays) {
        this.totalDays = totalDays;
        return this;
    }
}
