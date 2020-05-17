package com.nav.spring.service;

import com.nav.spring.model.Speaker;
import com.nav.spring.repository.HibernateSpeakerRepositoryImpl;
import com.nav.spring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
