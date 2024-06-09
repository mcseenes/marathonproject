package com.enes.marathonproject.controller;

import com.enes.marathonproject.dto.request.UrunEklemeRequestDto;
import com.enes.marathonproject.entity.Urun;
import com.enes.marathonproject.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.enes.marathonproject.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class UrunController {
    @Autowired
    private UrunService urunService;

    @PostMapping(ADD_URUN)
    public void save(@RequestBody UrunEklemeRequestDto dto){
        urunService.save(dto);
    }

    @GetMapping(URUNLER)
    public List<Urun> findAll() {
       return urunService.urunleriGetir();
    }


}
