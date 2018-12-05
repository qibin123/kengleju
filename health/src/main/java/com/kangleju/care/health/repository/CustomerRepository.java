package com.kangleju.care.health.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.health.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {
	Customer findByUuid(String uuid);
	List<Customer> findByAssignedDevices(String deviceId);
}
