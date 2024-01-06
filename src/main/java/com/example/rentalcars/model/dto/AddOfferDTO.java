package com.example.rentalcars.model.dto;

import com.example.rentalcars.model.enums.CoupeTypeEnum;
import com.example.rentalcars.model.enums.FuelTypeEnum;
import com.example.rentalcars.model.enums.GearboxEnum;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class AddOfferDTO {

    @NotNull
    @Min(1)
    private Long modelId;
    @NotNull
    @Positive
    private BigDecimal pricePerDay;

    @NotNull
    @Min(2000)
    private Integer year;

    @NotEmpty
    private String description;
    @NotNull
    private FuelTypeEnum engine;
    @NotNull
    private GearboxEnum transmission;

    @NotNull
    @Min(30)
    @Max(150)
    private Integer fuelTankVolume;

    @NotNull
    @Min(1)
    @Max(8)
    private Integer seatsCount;

    @Positive
    @NotNull
    private BigDecimal deposit;
    @NotEmpty
    private String imageUrl;

    @NotNull
    @Positive
    private Integer mileage;

    @NotNull
    private CoupeTypeEnum coupeType;

    public Long getModelId() {
        return modelId;
    }

    public AddOfferDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public AddOfferDTO setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public AddOfferDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddOfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public FuelTypeEnum getEngine() {
        return engine;
    }

    public AddOfferDTO setEngine(FuelTypeEnum engine) {
        this.engine = engine;
        return this;
    }

    public GearboxEnum getTransmission() {
        return transmission;
    }

    public AddOfferDTO setTransmission(GearboxEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AddOfferDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getSeatsCount() {
        return seatsCount;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public AddOfferDTO setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public AddOfferDTO setSeatsCount(Integer seatsCount) {
        this.seatsCount = seatsCount;
        return this;
    }

    public Integer getFuelTankVolume() {
        return fuelTankVolume;
    }

    public AddOfferDTO setFuelTankVolume(Integer fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public AddOfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public CoupeTypeEnum getCoupeType() {
        return coupeType;
    }

    public AddOfferDTO setCoupeType(CoupeTypeEnum coupeType) {
        this.coupeType = coupeType;
        return this;
    }
}
