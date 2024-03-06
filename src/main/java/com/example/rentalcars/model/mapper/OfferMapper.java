package com.example.rentalcars.model.mapper;

import com.example.rentalcars.model.dto.AddOfferDTO;
import com.example.rentalcars.model.dto.OfferDetailsDTO;
import com.example.rentalcars.model.entity.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OfferMapper {

    OfferEntity addOfferDTOToOfferEntity(AddOfferDTO addOfferDTO);

    @Mapping(source = "model.name" ,target = "model")
    @Mapping(source = "model.brand.name", target = "brand")
    @Mapping(source = "owner.firstName", target = "ownerFirstName")
    @Mapping(source = "owner.lastName", target = "ownerLastName")
    OfferDetailsDTO offerEntityToOfferDetailDTO(OfferEntity offerEntity);


}
