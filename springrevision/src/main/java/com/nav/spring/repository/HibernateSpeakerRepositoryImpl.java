package com.nav.spring.repository;

import com.google.common.collect.ImmutableList;
import com.nav.spring.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100}")
    private Double seedNum;

    @Override
    public List<Speaker> findAll(){
        System.out.println("cal: " + cal.getTime());
        return ImmutableList.copyOf(new ArrayList<>(
                Arrays.asList(
                        new Speaker("Navneet", "Kumar", seedNum),
                        new Speaker("John", "Doe", seedNum)
                )
        ));
    }

}
