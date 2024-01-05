package com.example.rentalcars.model.dto;

import com.example.rentalcars.model.enums.FuelTypeEnum;
import com.example.rentalcars.model.enums.GearboxEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AddOfferDTO {

    @NotNull
    @Min(1)
    private Long modelId;
    @NotNull
    private FuelTypeEnum engine;
    @NotNull
    private GearboxEnum transmission;

    @NotEmpty
    private String imgURL;

    public Long getModelId() {
        return modelId;
    }

    public AddOfferDTO setModelId(Long modelId) {
        this.modelId = modelId;
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

    public String getImgURL() {
        return imgURL;
    }

    public AddOfferDTO setImgURL(String imgURL) {
        this.imgURL = imgURL;
        return this;
    }
}
