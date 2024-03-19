package com.example.rentalcars.model.dto;

public class MyOffersDTO {
    String model;
    String brand;



    String coupeType;

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

    public String getBrandAndModel(String brand, String model){
        return brand + " " + model;
    }
}


