package com.kangleju.care.iotservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kangleju.care.iotservice.model.BloodPressureData;
import com.kangleju.care.iotservice.model.FallData;
import com.kangleju.care.iotservice.model.HeartRateData;
import com.kangleju.care.iotservice.model.MessageData;
import com.kangleju.care.iotservice.model.PositionData;
import com.kangleju.care.iotservice.model.ReturnStatus;
import com.kangleju.care.iotservice.model.SOSData;
import com.kangleju.care.iotservice.model.SleepData;
import com.kangleju.care.iotservice.model.StepsData;
import com.kangleju.care.iotservice.service.PushDataService;

@RestController
@RequestMapping(value="/v1/pushdata/")
public class PostLocationController {
	@Autowired
	PushDataService pushDataService;
	
	@PostMapping("/bloodpressuredata")
	public ReturnStatus saveBloodPressureData(@ModelAttribute BloodPressureData bloodPressureData) {
		return pushDataService.saveBloodPressureData(bloodPressureData);
	}
	
	@PostMapping("/falldata")
	public ReturnStatus saveFallData(@ModelAttribute FallData fallData) {
		return pushDataService.saveFallData(fallData);
	}	
	
	@PostMapping("/heartratedata")
	public ReturnStatus saveHeartRateData(@ModelAttribute HeartRateData heartRateData) {
		return pushDataService.saveHeartRateData(heartRateData);
	}
	
	@PostMapping("/messagedata")
	public ReturnStatus saveMessageData(@ModelAttribute MessageData messageData) {
		return pushDataService.saveMessageData(messageData);	
	}
	
	@PostMapping("/positiondata")
	public ReturnStatus savePositionData(@ModelAttribute PositionData positionData) {
		return pushDataService.savePositionData(positionData);
	}
	
	@PostMapping("/sleepdata")
	public ReturnStatus saveSleepData(@ModelAttribute SleepData sleepData) {
		return pushDataService.saveSleepData(sleepData);
	}
	
	@PostMapping("/stepsdata")
	public ReturnStatus saveStepsData(@ModelAttribute StepsData stepsData) {
		return pushDataService.saveStepsData(stepsData);
	}	
	
	@PostMapping("/sosdata")
	public ReturnStatus saveSosData(@ModelAttribute SOSData sosData) {
		return pushDataService.saveSosData(sosData);
	}	
}
