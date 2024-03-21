package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.AddOfferDTO;
import com.example.rentalcars.model.dto.MyOffersDTO;
import com.example.rentalcars.model.dto.OfferDetailsDTO;
import com.example.rentalcars.model.entity.ModelEntity;
import com.example.rentalcars.model.entity.OfferEntity;
import com.example.rentalcars.model.entity.UserEntity;
import com.example.rentalcars.model.mapper.OfferMapper;
import com.example.rentalcars.repository.ModelRepository;
import com.example.rentalcars.repository.OfferRepository;
import com.example.rentalcars.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class OfferService {

    private final OfferRepository offerRepository;
    private final OfferMapper offerMapper;
    private final UserRepository userRepository;
    private final ModelRepository modelRepository;

    public OfferService(OfferRepository offerRepository, OfferMapper offerMapper, UserRepository userRepository, ModelRepository modelRepository) {
        this.offerRepository = offerRepository;
        this.offerMapper = offerMapper;
        this.userRepository = userRepository;
        this.modelRepository = modelRepository;
    }

    public Page<OfferDetailsDTO> getAllOffers(Pageable pageable){
        return offerRepository.findAll(pageable).map(offerMapper::offerEntityToOfferDetailDTO);
    }

    public void addOffer(AddOfferDTO addOfferDTO, UserDetails userDetails){

        OfferEntity newOffer = offerMapper
                .addOfferDTOToOfferEntity(addOfferDTO);
        newOffer.setUUID(UUID.randomUUID());
        newOffer.setActive(true);
        //TODO: current user should be logged in
        UserEntity owner = userRepository.findByEmail(userDetails.getUsername()).orElseThrow();

        ModelEntity model = modelRepository.findById(addOfferDTO.getModelId()).orElseThrow();

        newOffer.setModel(model);
        newOffer.setOwner(owner);

        offerRepository.save(newOffer);
    }

    public Optional<OfferDetailsDTO> findOfferByUUID(UUID uuid) {
        return this.offerRepository.
                findById(uuid).
                map(offerMapper::offerEntityToOfferDetailDTO);
    }

    public List<MyOffersDTO> getOffersByOwner(UserDetails userDetails) {

        return this.offerRepository.findByOwnerEmail(userDetails.getUsername()).stream().map(offerMapper::offerEntityToMyOffersDto).collect(Collectors.toList());
    }
}
