package com.nav.spring.service;

import com.nav.spring.repository.SpeakerRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeakerServiceImplTest {

    private SpeakerService speakerService = new SpeakerServiceImpl();
    @Test
    public void findAll() {
        assertEquals("Navneet", speakerService.findAll().get(0).getFirstName(), "First Name is Navneet");
    }
}