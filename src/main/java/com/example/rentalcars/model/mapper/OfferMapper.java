package com.example.rentalcars.model.mapper;

import com.example.rentalcars.model.dto.AddOfferDTO;
import com.example.rentalcars.model.entity.OfferEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferMapper {

    OfferEntity addOfferDTOToOfferEntity(AddOfferDTO addOfferDTO);
}
