package com.example.rentalcars.service;

import com.example.rentalcars.model.dto.BrandDTO;
import com.example.rentalcars.model.dto.ModelDTO;
import com.example.rentalcars.model.entity.BrandEntity;
import com.example.rentalcars.model.entity.ModelEntity;
import com.example.rentalcars.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<BrandDTO> getAllBrands(){
       return brandRepository.
                findAll().
                stream().
                map(this::map).
                collect(Collectors.toList());

    }

    private BrandDTO map(BrandEntity brandEntity){
        List<ModelDTO> models = brandEntity.
                getModels().
                stream().
                map(this::mapModel).
                toList();
        
        return new BrandDTO().
                setModels(models).
                setName(brandEntity.getName());
    }

    private ModelDTO mapModel(ModelEntity model) {
        return new ModelDTO().
                setId(model.getId()).
                setName(model.getName());
    }
}
