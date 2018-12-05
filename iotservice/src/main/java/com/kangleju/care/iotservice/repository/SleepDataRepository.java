package com.kangleju.care.iotservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.iotservice.model.SleepData;


public interface SleepDataRepository extends CrudRepository<SleepData, String> {

}

