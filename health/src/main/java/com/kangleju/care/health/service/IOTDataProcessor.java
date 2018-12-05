package com.kangleju.care.health.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.kangleju.care.health.dto.BloodPressureDTO;
import com.kangleju.care.health.dto.FallDTO;
import com.kangleju.care.health.dto.HeartRateDTO;
import com.kangleju.care.health.dto.FenceDTO;
import com.kangleju.care.health.dto.SOSDTO;
import com.kangleju.care.health.dto.SleepDTO;
import com.kangleju.care.health.dto.StepsDTO;
import com.kangleju.care.health.model.BloodPressureData;
import com.kangleju.care.health.model.Customer;
import com.kangleju.care.health.model.HeartRateData;
import com.kangleju.care.health.model.StepsData;
import com.kangleju.care.health.repository.BloodPressureRepository;
import com.kangleju.care.health.repository.CustomerRepository;
import com.kangleju.care.health.repository.HeartRateRepository;
import com.kangleju.care.health.repository.StepsRepository;

public class IOTDataProcessor {
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	StepsRepository stepsRepository;
	
	@Autowired
	BloodPressureRepository bloodPressureRepository;
	
	@Autowired
	HeartRateRepository heartRateRepository;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@StreamListener(target=IOTSource.STEPS)
	public void processStepsData(StepsDTO data) {
		if(data == null)
			return;
		
		Customer customer = findCustomerByDeviceId(data.getDeviceid());
		if(customer == null)
			return;
		
		String customerUuid = customer.getUuid();
		String orgUuid = customer.getOrgUuid();
		
		String date = getDateSection(data.getTime());
		
		StepsData stepsData = stepsRepository.findByCustomerUuidAndDate(customerUuid, date);
		
		if(stepsData != null) {
			stepsData.setTime(data.getTime());
			stepsData.setValue(data.getValue());
			stepsData.getDataPoints().add(data);
			
			stepsRepository.save(stepsData);
		}
		else {
			stepsData = StepsData.builder().customerUuid(customerUuid).orgUuid(orgUuid).date(date).time(data.getTime()).value(data.getValue()).build();
			List<StepsDTO> list = new ArrayList<StepsDTO>();
			list.add(data);
			stepsData.setDataPoints(list);
			
			stepsRepository.save(stepsData);
		}

	}

	@StreamListener(target=IOTSource.BLOODPRESSURE)
	public void processBloodPressureData(BloodPressureDTO data) {
		if(data == null)
			return;
		
		Customer customer = findCustomerByDeviceId(data.getDeviceid());
		if(customer == null)
			return;
		
		String customerUuid = customer.getUuid();
		String orgUuid = customer.getOrgUuid();
		
		String date = getDateSection(data.getTime());
		
		BloodPressureData bloodPressureData = bloodPressureRepository.findByCustomerUuidAndDate(customerUuid, date);
		
		if(bloodPressureData != null) {
			bloodPressureData.setTime(data.getTime());
			bloodPressureData.setDbp(data.getDbp());
			bloodPressureData.setSbp(data.getSbp());
			bloodPressureData.getDataPoints().add(data);
			
			bloodPressureRepository.save(bloodPressureData);
		}
		else {
			bloodPressureData = BloodPressureData.builder().customerUuid(customerUuid).orgUuid(orgUuid).date(date).time(data.getTime())
					.dbp(data.getDbp()).sbp(data.getSbp()).build();
			List<BloodPressureDTO> list = new ArrayList<BloodPressureDTO>();
			list.add(data);
			bloodPressureData.setDataPoints(list);
			
			bloodPressureRepository.save(bloodPressureData);
		}
	}
	
	@StreamListener(target=IOTSource.FALL)
	public void processFallData(FallDTO data) {
	  //System.out.println(data);
	}
	
	@StreamListener(target=IOTSource.HEARTRATE)
	public void processHeartRateData(HeartRateDTO data) {
		if(data == null)
			return;
		
		Customer customer = findCustomerByDeviceId(data.getDeviceid());
		if(customer == null)
			return;
		
		String customerUuid = customer.getUuid();
		String orgUuid = customer.getOrgUuid();
		
		String date = getDateSection(data.getTime());
		
		HeartRateData heartRateData = heartRateRepository.findByCustomerUuidAndDate(customerUuid, date);
		
		if(heartRateData != null) {
			heartRateData.setTime(data.getTime());
			heartRateData.setRate(data.getHeartrate());
			heartRateData.getDataPoints().add(data);
			
			heartRateRepository.save(heartRateData);
		}
		else {
			heartRateData = HeartRateData.builder().customerUuid(customerUuid).orgUuid(orgUuid).date(date).time(data.getTime()).rate(data.getHeartrate()).build();
			List<HeartRateDTO> list = new ArrayList<HeartRateDTO>();
			list.add(data);
			heartRateData.setDataPoints(list);
			
			heartRateRepository.save(heartRateData);
		}
	}
	
	@StreamListener(target=IOTSource.SOS)
	public void processSOSData(SOSDTO data) {
	  //System.out.println(data);
	}
	
	@StreamListener(target=IOTSource.SLEEP)
	public void processSleepData(SleepDTO data) {
	  //System.out.println(data);
	}
	
	@StreamListener(target=IOTSource.FENCE)
	public void processMessageData(FenceDTO data) {
	  //System.out.println(data);
	}
	
	Customer findCustomerByDeviceId(String deviceId) {
  	  List<Customer> customers = customerRepository.findByAssignedDevices(deviceId);
	  
  	  if(customers != null && customers.size() > 0) {
  		  return customers.get(0);
  	  }
  	  
  	  return null;
		
	}
	
	String getDateSection(String time) {
		return time.substring(0, 10);
	}
	
}
