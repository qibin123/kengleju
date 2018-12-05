package com.kangleju.care.iotservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kangleju.care.iotservice.model.DeviceInfo;
import com.kangleju.care.iotservice.model.DevicePosition;
import com.kangleju.care.iotservice.service.ServiceAdapter;

@RestController
@RequestMapping(value="/v1/{organizationId}/query/")
public class QueryLocationController {
	@Autowired 
	ServiceAdapter serviceAdapter;
	
	@GetMapping(value="/device/{deviceId}")
	public DeviceInfo getDeviceInfo(@PathVariable("organizationId") String organizationId, @PathVariable("deviceId") String deviceId) {
		return serviceAdapter.getDeviceInfo(deviceId);
	}
	
	@GetMapping(value="/locationdata/{deviceId}")
	public List<DevicePosition> getLocationData(@PathVariable("organizationId") String organizationId, @PathVariable("deviceId") String deviceId) {
		return serviceAdapter.getLocationHistory(deviceId);
	}
}
