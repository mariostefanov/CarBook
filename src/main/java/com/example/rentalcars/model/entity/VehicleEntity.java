package com.example.rentalcars.model.entity;

import com.example.rentalcars.model.enums.CoupeTypeEnum;
import com.example.rentalcars.model.enums.FuelTypeEnum;
import com.example.rentalcars.model.enums.GearboxEnum;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicles")
public class VehicleEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FuelTypeEnum engine;

    private String imageUrl;

    @Column(nullable = false)
    private BigDecimal pricePerDay;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GearboxEnum transmission;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CoupeTypeEnum category;

    @Column(nullable = false)
    private int year;

    @ManyToOne
    private ModelEntity model;

    private int seatsCount;

    private int fuelTankVolume;

    private int doorsCount;


    public FuelTypeEnum getEngine() {
        return engine;
    }

    public VehicleEntity setEngine(FuelTypeEnum engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public VehicleEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public VehicleEntity setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VehicleEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public GearboxEnum getTransmission() {
        return transmission;
    }

    public VehicleEntity setTransmission(GearboxEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public CoupeTypeEnum getCategory() {
        return category;
    }

    public VehicleEntity setCategory(CoupeTypeEnum category) {
        this.category = category;
        return this;
    }

    public int getYear() {
        return year;
    }

    public VehicleEntity setYear(int year) {
        this.year = year;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public VehicleEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public VehicleEntity setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
        return this;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public VehicleEntity setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
        return this;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public VehicleEntity setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
        return this;
    }
}
