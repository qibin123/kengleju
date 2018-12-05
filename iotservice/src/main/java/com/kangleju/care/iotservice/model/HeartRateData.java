package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "HeartRateData")
@Builder
public class HeartRateData {
	@Id
	String id;
	
	String imei;
	String time_begin;
	int heartrate;
	int theshold_heartrate_h;
	int theshold_heartrate_l;
}
