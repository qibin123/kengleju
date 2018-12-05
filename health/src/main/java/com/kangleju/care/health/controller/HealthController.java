package com.kangleju.care.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kangleju.care.health.dto.MonitorDataDTO;
import com.kangleju.care.health.model.Register;
import com.kangleju.care.health.model.Subscription;
import com.kangleju.care.health.service.HealthService;

@RestController
@RequestMapping(value="/v1/{organizationId}")
public class HealthController {

	@Autowired
	HealthService healthService;
	
	@GetMapping(value="/subscriptions/{uuid}")
	public Subscription findSubscriptionByUuid(@PathVariable("organizationId") String organizationId,@PathVariable("uuid") String uuid) {
		return healthService.findSubscriptionByUuid(uuid);
	}
	
	@GetMapping(value="/subscriptions/patients/{patientＵuid}")
	public List<Subscription> findSubscriptionByPatientUuid(@PathVariable("organizationId") String organizationId, @PathVariable("patientＵuid") String patientUuid) {
		return healthService.findSubscriptionByPatientUuid(patientUuid);
	}
	
	@PutMapping(value="/subscriptions/cancel/{uuid}")
	public Subscription cancelSubscriptionByUuid(@PathVariable("organizationId") String organizationId, @PathVariable("uuid") String uuid) {
		return healthService.cancelSubscription(uuid);
	}
	
	@PostMapping(value="/subscriptions")
	public Subscription createSubscription(@PathVariable("organizationId") String organizationId, @RequestBody Subscription subscription) {
		return healthService.saveRSubscription(subscription);
	}
	
	@GetMapping(value="/registers/{uuid}")
	public Register findRegisterByUuid(@PathVariable("organizationId") String organizationId, @PathVariable("uuid") String uuid) {
		return healthService.findRegisterByUuid(uuid);
	}
	
	@GetMapping(value="/registers/patients/{patientUuid}")
	public List<Register> findRegisterByPatientUuid(@PathVariable("organizationId") String organizationId, @PathVariable("patientUuid")String patientUuid) {
		return healthService.findRegisterByPatientUuid(patientUuid);
	}
	
	@PutMapping(value="/registers/cancel/{uuid}")
	public Register cancelRegisterByUuid(@PathVariable("organizationId") String organizationId, @PathVariable("uuid") String uuid) {
		return healthService.cancelRegister(uuid);
	}
	
	@PostMapping(value="/registers")
	public Register createRegister(@PathVariable("organizationId") String organizationId, @RequestBody Register register) {
		return healthService.saveRegister(register);
	}
	
	@GetMapping(value="/monitor/customers/{customerUuid}")
	public MonitorDataDTO getHealthMonitoringData(@PathVariable("organizationId") String organizationId, @PathVariable("customerUuid") String customerUuid)
	{
		return healthService.getHealthMonitoringData(customerUuid);
	}
	
}
