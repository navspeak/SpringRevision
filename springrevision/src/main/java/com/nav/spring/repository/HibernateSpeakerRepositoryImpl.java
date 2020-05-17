package com.nav.spring.repository;

import com.google.common.collect.ImmutableList;
import com.nav.spring.model.Speaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        return ImmutableList.copyOf(new ArrayList<>(
                Arrays.asList(
                        new Speaker("Navneet", "Kumar"),
                        new Speaker("John", "Doe")
                )
        ));
    }

}
