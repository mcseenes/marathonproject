package com.enes.marathonproject.service;

import com.enes.marathonproject.dto.request.ModelRequestDto;
import com.enes.marathonproject.entity.Model;
import com.enes.marathonproject.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;

    public void save(ModelRequestDto dto){
        modelRepository.save(Model.builder()
                .ad(dto.getAd())
                .build());
    }
}
