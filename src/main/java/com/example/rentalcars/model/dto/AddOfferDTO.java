package com.example.rentalcars.model.dto;

import com.example.rentalcars.model.enums.FuelTypeEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AddOfferDTO {
    @NotNull
    private FuelTypeEnum engine;

    @NotEmpty
    private String imgURL;

    public FuelTypeEnum getEngine() {
        return engine;
    }

    public AddOfferDTO setEngine(FuelTypeEnum engine) {
        this.engine = engine;
        return this;
    }


    public String getImgURL() {
        return imgURL;
    }

    public AddOfferDTO setImgURL(String imgURL) {
        this.imgURL = imgURL;
        return this;
    }
}
