package com.enes.marathonproject.controller;

import com.enes.marathonproject.service.UrunOzelligiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class UrunOzelligiController {
    private final UrunOzelligiService urunOzelligiService;
}
