package com.kangleju.care.health.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "sleepdata")
@Builder
public class SleepData {
	@Id
	String id;

	String orgUuid;
	String customerUuid;
	
	int interval;
	int total;
	
	String date;
	
}
