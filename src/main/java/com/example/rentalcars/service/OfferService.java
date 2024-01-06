package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.AddOfferDTO;
import com.example.rentalcars.model.entity.ModelEntity;
import com.example.rentalcars.model.entity.OfferEntity;
import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.model.mapper.OfferMapper;
import com.example.rentalcars.repository.ModelRepository;
import com.example.rentalcars.repository.OfferRepository;
import com.example.rentalcars.repository.UserRepository;
import com.example.rentalcars.user.CurrentUser;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    private final OfferRepository offerRepository;
    private final OfferMapper offerMapper;
    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    private final ModelRepository modelRepository;

    public OfferService(OfferRepository offerRepository, OfferMapper offerMapper, UserRepository userRepository, CurrentUser currentUser, ModelRepository modelRepository) {
        this.offerRepository = offerRepository;
        this.offerMapper = offerMapper;
        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.modelRepository = modelRepository;
    }

    public void addOffer(AddOfferDTO addOfferDTO){

        OfferEntity newOffer = offerMapper
                .addOfferDTOToOfferEntity(addOfferDTO);

        //TODO: current user should be logged in
        UserEntity owner = userRepository.findByEmail(currentUser.getEmail()).orElseThrow();

        ModelEntity model = modelRepository.findById(addOfferDTO.getModelId()).orElseThrow();

        newOffer.setModel(model);

        newOffer.setOwner(owner);

        offerRepository.save(newOffer);
    }

}
