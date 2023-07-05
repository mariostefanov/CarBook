package com.example.rentalcars.model.entity;

import com.example.rentalcars.model.enums.EngineEnum;
import com.example.rentalcars.model.enums.TransmissionEnum;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EngineEnum engine;

    private String imageUrl;

    private int mileage;

    @Column(nullable = false)
    private BigDecimal pricePerDay;

    private String description;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransmissionEnum transmission;

    @Column(nullable = false)
    private int year;

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferEntity setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public OfferEntity setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public int getYear() {
        return year;
    }

    public OfferEntity setYear(int year) {
        this.year = year;
        return this;
    }
}
