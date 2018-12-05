package com.kangleju.care.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.kangleju.care.health.dto.MonitorDataDTO;
import com.kangleju.care.health.model.BloodPressureData;
import com.kangleju.care.health.model.HeartRateData;
import com.kangleju.care.health.model.Register;
import com.kangleju.care.health.model.StepsData;
import com.kangleju.care.health.model.Subscription;
import com.kangleju.care.health.repository.BloodPressureRepository;
import com.kangleju.care.health.repository.HeartRateRepository;
import com.kangleju.care.health.repository.RegisterRepository;
import com.kangleju.care.health.repository.StepsRepository;
import com.kangleju.care.health.repository.SubscriptionRepository;

@Component
public class HealthService {
	@Autowired
	RegisterRepository registerRepository;
	
	@Autowired
	SubscriptionRepository subscriptionRepository;
	
	@Autowired
	HeartRateRepository heartRateRepository;
	
	@Autowired
	BloodPressureRepository bloodPressureRepository;
	
	@Autowired
	StepsRepository stepsRepository;
	
	public Register saveRegister(Register register) {
		return registerRepository.save(register);
	}
	
	public Register cancelRegister(String uuid) {
		Register register = registerRepository.findByUuid(uuid);
		
		if(register != null) {
			register.setStatus("1"); //1: canceled
			register = registerRepository.save(register);
			
			return register;
		}
		else {
			//failed, throw exception
			return null;
		}
			
	}
	
	public Register findRegisterByUuid(String uuid) {
		return registerRepository.findByUuid(uuid);
	}
	
	public List<Register> findRegisterByPatientUuid(String patientUuid){
		return registerRepository.findByPatientUuid(patientUuid);
	
	}
	
	public Subscription saveRSubscription(Subscription subscription) {
		return subscriptionRepository.save(subscription);
	}
	
	public Subscription cancelSubscription(String uuid) {
		Subscription subscription = subscriptionRepository.findByUuid(uuid);
		
		if(subscription != null) {
			subscription.setStatus("1"); //1: canceled
			subscription = subscriptionRepository.save(subscription);
			
			return subscription;
		}
		else {
			//failed, throw exception
			return null;
		}
			
	}
	
	public Subscription findSubscriptionByUuid(String uuid) {
		return subscriptionRepository.findByUuid(uuid);
	}
	
	public List<Subscription> findSubscriptionByPatientUuid(String patientUuid) {
		return subscriptionRepository.findByPatientUuid(patientUuid);
	}
	
	static final int COUNT = 14;
	static final Sort SORT = new Sort(Sort.Direction.DESC,"date");
	
	public MonitorDataDTO getHealthMonitoringData(String customerUuid) {
		MonitorDataDTO dto = new MonitorDataDTO();
		
		//Heart Rate
		List<HeartRateData> listHeartRate = heartRateRepository.findDataItemsExcludeId(customerUuid, PageRequest.of(0, COUNT, SORT));
		int size = listHeartRate.size();
		
		if(size > 0) {
			String[] dates = new String[size];
			int[] rates = new int[size];
			
			for(int i=size; i>0; i--) {
				dates[size-i] = listHeartRate.get(i-1).getDate();
				rates[size-i] = listHeartRate.get(i-1).getRate();
			}
			
			dto.setHeartRateDate(dates);
			dto.setHeartRateRate(rates);
		}
		
		//Steps
		List<StepsData> listSteps = stepsRepository.findDataItemsExcludeId(customerUuid, PageRequest.of(0, COUNT, new Sort(Sort.Direction.DESC,"date")));
		size = listSteps.size();
		
		if(size > 0) {
			String[] dates = new String[size];
			int[] values = new int[size];
			
			for(int i=size; i>0; i--) {
				dates[size-i] = listSteps.get(i-1).getDate();
				values[size-i] = listSteps.get(i-1).getValue();
			}
			
			dto.setStepsDate(dates);
			dto.setStepsValue(values);
		}
		
		//Blood Pressure
		List<BloodPressureData> listBloodPressure = bloodPressureRepository.findDataItemsExcludeId(customerUuid, PageRequest.of(0, COUNT, new Sort(Sort.Direction.DESC,"date")));
		size = listBloodPressure.size();
		
		if(size > 0) {
			String[] dates = new String[size];
			int[] dbps = new int[size];
			int[] sbps = new int[size];
			
			for(int i=size; i>0; i--) {
				dates[size-i] = listBloodPressure.get(i-1).getDate();
				dbps[size-i] = listBloodPressure.get(i-1).getDbp();
				sbps[size-i] = listBloodPressure.get(i-1).getSbp();
			}
			
			dto.setBloodPressureDate(dates);
			dto.setBloodPressureDbp(dbps);
			dto.setBloodPressureSbp(sbps);
		}
		
		return dto;
	}
	
}
