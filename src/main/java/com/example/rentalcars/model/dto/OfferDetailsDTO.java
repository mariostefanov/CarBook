package com.example.rentalcars.model.dto;

import com.example.rentalcars.model.enums.CoupeTypeEnum;
import com.example.rentalcars.model.enums.FuelTypeEnum;
import com.example.rentalcars.model.enums.GearboxEnum;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class OfferDetailsDTO {
    private String imageUrl;

    private BigDecimal pricePerDay;


    private Integer year;


    private String description;

    private FuelTypeEnum engine;

    private GearboxEnum transmission;

    private Integer fuelTankVolume;

    private Integer seatsCount;

    private BigDecimal deposit;

    private Integer mileage;

    private CoupeTypeEnum coupeType;

    public OfferDetailsDTO() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferDetailsDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }


    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public OfferDetailsDTO setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public OfferDetailsDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferDetailsDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public FuelTypeEnum getEngine() {
        return engine;
    }

    public OfferDetailsDTO setEngine(FuelTypeEnum engine) {
        this.engine = engine;
        return this;
    }

    public GearboxEnum getTransmission() {
        return transmission;
    }

    public OfferDetailsDTO setTransmission(GearboxEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public Integer getFuelTankVolume() {
        return fuelTankVolume;
    }

    public OfferDetailsDTO setFuelTankVolume(Integer fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
        return this;
    }

    public Integer getSeatsCount() {
        return seatsCount;
    }

    public OfferDetailsDTO setSeatsCount(Integer seatsCount) {
        this.seatsCount = seatsCount;
        return this;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public OfferDetailsDTO setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferDetailsDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public CoupeTypeEnum getCoupeType() {
        return coupeType;
    }

    public OfferDetailsDTO setCoupeType(CoupeTypeEnum coupeType) {
        this.coupeType = coupeType;
        return this;
    }
}
