package com.example.rentalcars.model.dto;

public class MyOffersDTO {
    private String model;
    private String brand;
    private String coupeType;

    private boolean isActive;

    public MyOffersDTO() {
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public MyOffersDTO setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public MyOffersDTO setModel(String model) {
        this.model = model;
        return this;
    }

//TODO: add boolean available

    public String getCoupeType() {
        return coupeType;
    }

    public MyOffersDTO setCoupeType(String coupeType) {
        this.coupeType = coupeType;
        return this;

    }

    public String getBrandAndModel(){
        return brand + " " + model;
    }

    public MyOffersDTO setActive(boolean active) {
        isActive = active;
        return this;
    }

    public boolean isActive(){
        return isActive;
    }

}


