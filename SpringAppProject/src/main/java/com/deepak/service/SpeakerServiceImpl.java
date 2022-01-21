package com.deepak.service;

import com.deepak.model.Speaker;
import com.deepak.repository.HibernateSpeakerRepositoryImpl;
import com.deepak.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker>  findALL(){
        return repository.findAll();

    }
}
