package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "BloodPressureData")
@Builder
public class BloodPressureData {
	@Id
	String id;
	
	String imei;
	String time_begin;
	int dbp;
	int dbp_l;
	int sbp;
	int sbp_h;
	
}
