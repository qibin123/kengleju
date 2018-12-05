package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "StepsData")
@Builder
public class StepsData {
	@Id
	String id;
	
	String imei;
	String time_begin;
	int value;
	
}
