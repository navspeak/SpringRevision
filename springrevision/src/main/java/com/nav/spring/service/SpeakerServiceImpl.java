package com.nav.spring.service;

import com.nav.spring.model.Speaker;
import com.nav.spring.repository.HibernateSpeakerRepositoryImpl;
import com.nav.spring.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

     //private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl Default ctor");
    }

    // Ctor for ctor injection
    //@Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl Repository ctor");
        this.speakerRepository = speakerRepository;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Called after ctors");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Destroy");
    }

    // for setter injection
    @Autowired // First no-args ctor is called
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter");
        this.speakerRepository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

}
