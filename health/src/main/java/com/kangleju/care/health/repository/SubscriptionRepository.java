package com.kangleju.care.health.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.health.model.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
	Subscription findByUuid(String uuid);
	List<Subscription> findByPatientUuid(String patientUuid);
}
