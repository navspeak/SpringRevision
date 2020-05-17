package com.nav.spring.service;

import com.nav.spring.model.Speaker;
import com.nav.spring.repository.HibernateSpeakerRepositoryImpl;
import com.nav.spring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

     //private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository speakerRepository;

    // Ctor for ctor injection
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    // for setter injection
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

}
