package com.example.rentalcars.model.entity;

import com.example.rentalcars.model.enums.CoupeTypeEnum;
import com.example.rentalcars.model.enums.FuelTypeEnum;
import com.example.rentalcars.model.enums.GearboxEnum;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FuelTypeEnum engine;//

    private String imageUrl;

    @Column(nullable = false)
    private BigDecimal pricePerDay;//

    @Column(nullable = false)
    private BigDecimal deposit;

    @Column(nullable = false, columnDefinition = "text")

    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GearboxEnum transmission;//

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CoupeTypeEnum coupeType;

    @Column(nullable = false)
    private int year;//

    @ManyToOne
    private ModelEntity model;//

    @ManyToOne(targetEntity = UserEntity.class)
    private UserEntity owner;

    private int seatsCount;

    private int fuelTankVolume;//


    private int mileage;


    public FuelTypeEnum getEngine() {
        return engine;
    }

    public OfferEntity setEngine(FuelTypeEnum engine) {
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

    public GearboxEnum getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(GearboxEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public CoupeTypeEnum getCoupeType() {
        return coupeType;
    }

    public OfferEntity setCoupeType(CoupeTypeEnum coupeType) {
        this.coupeType = coupeType;
        return this;
    }

    public int getYear() {
        return year;
    }

    public OfferEntity setYear(int year) {
        this.year = year;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public OfferEntity setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
        return this;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public OfferEntity setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public OfferEntity setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public UserEntity getOwner() {
        return owner;
    }

    public OfferEntity setOwner(UserEntity owner) {
        this.owner = owner;
        return this;
    }
}
