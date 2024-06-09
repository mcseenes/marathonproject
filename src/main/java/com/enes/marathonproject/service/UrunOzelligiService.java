package com.enes.marathonproject.service;

import com.enes.marathonproject.repository.UrunOzelligiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UrunOzelligiService {
    private final UrunOzelligiRepository urunOzelligiRepository;
}
