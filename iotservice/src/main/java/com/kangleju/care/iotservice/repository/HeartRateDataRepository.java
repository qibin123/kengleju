package com.kangleju.care.iotservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.iotservice.model.HeartRateData;


public interface HeartRateDataRepository extends CrudRepository<HeartRateData, String> {

}

