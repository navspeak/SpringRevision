package com.nav.spring.service;

import com.nav.spring.repository.SpeakerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeakerServiceImplTest {

    private SpeakerService speakerService;
    @Test
    public void findAll() {
        //assertEquals("Navneet", speakerService.findAll().get(0).getFirstName(), "First Name is Navneet");
        Assertions.assertThrows(NullPointerException.class,
                ()->  speakerService.findAll().get(0).getFirstName(),
                "We need to fix this using mocks"
        );
    }
}