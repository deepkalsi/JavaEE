package com.deepak.repository;

import com.deepak.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {


    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker =  new Speaker();

        speaker.setFirstName("Deepak");
        speaker.setLastName("Kalsi");

        speakers.add(speaker);

        return speakers;

    }

}
