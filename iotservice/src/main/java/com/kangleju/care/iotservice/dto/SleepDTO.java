package com.kangleju.care.iotservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SleepDTO {

	String deviceid;
	String timeBegin;
	String timeEnd;
	int interval;
	int total;
	String data; 
}
