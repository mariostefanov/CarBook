package com.example.rentalcars.model.entity;

import com.example.rentalcars.model.enums.CoupeTypeEnum;
import com.example.rentalcars.model.enums.DriveWheelEnum;
import jakarta.persistence.*;


@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity{
    @Column(nullable = false)
    private String name;

    private int year;

    private int seatsCount;

    private int fuelTankVolume;

    private int doorsCount;

    @ManyToOne
    private BrandEntity brand;

    public String getName() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public int getYear() {
        return year;
    }

    public ModelEntity setYear(int startYear) {
        this.year = startYear;
        return this;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public ModelEntity setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
        return this;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public ModelEntity setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
        return this;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public ModelEntity setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
        return this;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public ModelEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }
}
