package com.kangleju.care.iotservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.iotservice.model.BloodPressureData;


public interface BloodPressureDataRepository extends CrudRepository<BloodPressureData, String> {

}

