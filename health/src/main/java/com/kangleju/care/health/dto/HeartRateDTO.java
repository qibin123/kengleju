package com.kangleju.care.health.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HeartRateDTO {
	
	String deviceid;
	String time;
	int heartrate;
	
}
