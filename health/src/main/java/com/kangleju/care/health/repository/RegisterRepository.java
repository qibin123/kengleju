package com.kangleju.care.health.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.health.model.Register;

public interface RegisterRepository extends CrudRepository<Register, String> {
	Register findByUuid(String uuid);
	List<Register> findByPatientUuid(String patientUuid);
}

