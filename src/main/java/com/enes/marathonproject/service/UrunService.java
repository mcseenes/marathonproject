package com.enes.marathonproject.service;

import com.enes.marathonproject.dto.request.UrunEklemeRequestDto;
import com.enes.marathonproject.entity.Urun;
import com.enes.marathonproject.repository.UrunRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UrunService {
    private final UrunRepository urunRepository;
    public void save(UrunEklemeRequestDto dto){
        urunRepository.save(Urun.builder()
                .ad(dto.getAd())
                .aciklama(dto.getAciklama())
                .fiyat(dto.getFiyat())
                .stokDurumu(dto.getStokDurumu())
                .anaResimUrl(dto.getAnaResimUrl())
                .build());
    }

    public List<Urun> urunleriGetir() {
        return urunRepository.findAll();
    }



    }

