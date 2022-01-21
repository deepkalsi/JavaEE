package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    @Transactional
    public String createBike(Bike bike) {
        //TODO: Validate email address
        try {
            System.out.println(bike.getEmail());
           // bike.setId((long) (bikeRepository.findMaxId() + 1));
            System.out.println(bike.getId());
            bikeRepository.save(bike);
            return "Bike Saved Successfully" + bike;
        } catch (Exception e) {
            throw e;
        }

    }

    public List<Bike> list() {
        return bikeRepository.findAll();
    }

    public Bike get(int id) {
        return bikeRepository.getOne((long) id);
    }

    public Bike getByEmail(String email){
        return bikeRepository.findByEmail(email);
    }



    @Transactional
    public String updateBike(Bike bike){
            if(bike.getEmail().equals(bikeRepository.findByEmail(bike.getEmail()).getEmail())) {
                try {
                    Bike bikeToUpdate = bikeRepository.findByEmail(bike.getEmail());
                    System.out.println(bikeRepository.findByEmail(bike.getEmail()).getEmail());
                    bikeToUpdate.setName(bike.getName());
                    bikeToUpdate.setSerialNumber(bike.getSerialNumber());
                    bikeRepository.save(bikeToUpdate);

                    return "Bike updated Successfully" + bike;
                }
                catch(Exception e){
                    throw e;
                }

            }
            else{return "Bike does not exist";}

        }

    @Transactional
    public String deleteBike(Bike bike) {
        if(bike.getEmail().equals(bikeRepository.findByEmail(bike.getEmail()).getEmail())) {
            try {
                Bike bikeToDelete = bikeRepository.findByEmail(bike.getEmail());
                bikeRepository.delete(bikeToDelete);
                return "Bike deleted Successfully" + bike;
            }
            catch(Exception e){
                throw e;
            }
        }
        else{return "Bike does not exist";}
    }

}

