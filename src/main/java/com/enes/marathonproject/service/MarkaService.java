package com.enes.marathonproject.service;

import com.enes.marathonproject.dto.request.MarkaEklemeDto;
import com.enes.marathonproject.entity.Marka;
import com.enes.marathonproject.repository.MarkaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository markaRepository;
    public void save(MarkaEklemeDto dto){
        markaRepository.save(Marka.builder()
                .ad(dto.getAd())
                .build());

    }




}
