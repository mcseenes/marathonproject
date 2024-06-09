package com.enes.marathonproject.controller;

import com.enes.marathonproject.dto.request.MarkaEklemeDto;
import com.enes.marathonproject.service.MarkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.enes.marathonproject.config.RestApis.ADD_MARKA;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class MarkaController {
    private final MarkaService markaService;

    @PostMapping(ADD_MARKA)
    public void save(@RequestBody MarkaEklemeDto dto){
        markaService.save(dto);
    }
}
