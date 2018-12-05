package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "SOSData")
@Builder
public class SOSData {
	@Id
	String id;
	
	String imei;
	String time_begin;
	int heartrate;
	String city;
	String address;
	double lon;
	double lat;
	String type;
}
