package com.globomatics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {

    @Query("Select max(b.id) from Bike b")
    public Integer findMaxId();

    @Query("from Bike b where b.email= :email")
    public Bike findByEmail(String email);



}
