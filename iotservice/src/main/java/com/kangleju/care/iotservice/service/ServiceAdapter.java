package com.kangleju.care.iotservice.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kangleju.care.iotservice.config.ServiceConfig;
import com.kangleju.care.iotservice.model.DeviceInfo;
import com.kangleju.care.iotservice.model.DevicePosition;
import com.kangleju.care.iotservice.model.Pos;
import com.kangleju.care.iotservice.model.proxy.device.DeviceData;
import com.kangleju.care.iotservice.model.proxy.device.Fence;
import com.kangleju.care.iotservice.model.proxy.device.LastLocation;
import com.kangleju.care.iotservice.model.proxy.device.UpdatedAt;
import com.kangleju.care.iotservice.model.proxy.positiondata.Obj;
import com.kangleju.care.iotservice.model.proxy.positiondata.PositionHistory;

@Service
@Configuration
public class ServiceAdapter {
	@Autowired
	ServiceConfig serviceConfig;
	
	String userCookie = null;
	LocalDateTime cookieCreateTime = null;
	
	String getUserCookie() {
		if(userCookie == null ) {
			//get new cookie
			//userCookie = "user=\"2|1:0|10:1542037991|4:user|16:MTUyMDEwMTc4MjU=|b6145408c511ab132f139985270fbe1f5dd52eab4bdad9f37f65f536693e27c2\"; path=/; domain=120.24.56.48; Expires=Tue, 13 Nov 2018 15:53:11 GMT;";
			refreshUserCookie();
		}
		else {
			LocalDateTime now = LocalDateTime.now();
			Duration diff = Duration.between(now, cookieCreateTime);
			
			if(diff.toHours() > 23) {
				refreshUserCookie();
			}
		}
		
		return userCookie;
	}
	
	void refreshUserCookie() {
		RestTemplate template = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("username", serviceConfig.getUser());
		map.add("password", serviceConfig.getPassword());

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
   
		HttpEntity<String> response = template.exchange(serviceConfig.getResourceUrl() + "/api/auth/login", HttpMethod.POST, request, String.class);
		
		headers = response.getHeaders();
		String set_cookie = headers.getFirst(HttpHeaders.SET_COOKIE);

		cookieCreateTime = LocalDateTime.now();
		userCookie = set_cookie;
	}
	
	public List<DevicePosition> getLocationHistory(String deviceId) {

		List<DevicePosition> positions = new ArrayList<DevicePosition>();
		
		try {
			RestTemplate restTemplate= new RestTemplate();
			
			HttpHeaders requestHeaders = new HttpHeaders();
			requestHeaders.add("Cookie", getUserCookie());
			/*
			
			HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
			
			ResponseEntity<String> response = restTemplate.exchange(serviceConfig.getResourceUrl() + "/api/locationdata/?device=" + deviceId + "&depth=1&rows_per_page=10", HttpMethod.GET, requestEntity, String.class);
			String data = (String) response.getBody();
			
			System.out.println(data);
			*/
			
			HttpEntity<PositionHistory> requestEntity = new HttpEntity<PositionHistory>(null, requestHeaders);
			
			ResponseEntity<PositionHistory> response = restTemplate.exchange(serviceConfig.getResourceUrl() + "/api/locationdata/?device=" + deviceId + "&depth=1&rows_per_page=10", HttpMethod.GET, requestEntity, PositionHistory.class);
			PositionHistory data = (PositionHistory) response.getBody();
			
			for(Obj obj : data.getObjs()) {
				List<Double> coords = obj.getPoint().getCoordinates();
				DevicePosition pos = DevicePosition.builder().city(obj.getCity()).address(obj.getAddress())
					.timeBegin(new Date(obj.getTimeBegin().get$date()))
					.createAt(new Date(obj.getCreatedAt().get$date()))
					.longitude(coords.get(0)).latitude(coords.get(1)).build();
				
				positions.add(pos);
				
			}
			
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

		return positions;
		
	}

	public DeviceInfo getDeviceInfo(String deviceId) {
		DeviceInfo info = DeviceInfo.builder().build();
		
		try {
			RestTemplate restTemplate= new RestTemplate();
			
			HttpHeaders requestHeaders = new HttpHeaders();
			requestHeaders.add("Cookie", getUserCookie());
			
			HttpEntity<DeviceData> requestEntity = new HttpEntity<DeviceData>(null, requestHeaders);
			
			ResponseEntity<DeviceData> response = restTemplate.exchange(serviceConfig.getResourceUrl() + "/api/device/" + deviceId, HttpMethod.GET, requestEntity, DeviceData.class);
			DeviceData data = (DeviceData) response.getBody();
			
			if(data != null && data.getObj() != null) {
				info = DeviceInfo.builder().lastCity(data.getObj().getLastCity())
						.lastAddress(data.getObj().getLastAddress())
						.imei(data.getObj().getImei())
						.sosNumber(data.getObj().getSosNumbers().get(0).getNum())
						.build();
				
				LastLocation location = data.getObj().getLastLocation();
				if(location != null && location.getCoordinates() != null && location.getCoordinates().size() > 1) {
					Pos pos = Pos.builder().longitude(location.getCoordinates().get(0)).latitude(location.getCoordinates().get(1)).build();
					info.setPoint(pos);
				}
				
				UpdatedAt lastUpdate = data.getObj().getUpdatedAt();
				if(lastUpdate != null) {
					info.setLastUpdate(new Date(lastUpdate.get$date()));
				}
						
				Fence fence0 = data.getObj().getFences().get(0);
				if(fence0 != null && fence0.getEnable()) {
					List<Pos> positions = new ArrayList<Pos>();
					
					List<List<Double>> coords = fence0.getSafeArea().getCoordinates().get(0);
				
					//last one is the repeat of the first position
					for(int i=0; i<coords.size()-1; i++) {
						Pos pos = Pos.builder().longitude(coords.get(i).get(0)).latitude(coords.get(i).get(1)).build();
						positions.add(pos);
					}
					
					info.setFence(positions);
				}
				

			}

		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		return info;
		
	}
	
}
