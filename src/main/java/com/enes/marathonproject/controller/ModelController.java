package com.enes.marathonproject.controller;

import com.enes.marathonproject.dto.request.ModelRequestDto;
import com.enes.marathonproject.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.enes.marathonproject.config.RestApis.ADD_MODEL;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class ModelController {
    private final ModelService modelService;

    @PostMapping(ADD_MODEL)
    public void save(@RequestBody ModelRequestDto dto){
        modelService.save(dto);
    }
}
