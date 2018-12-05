package com.kangleju.care.health.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BloodPressureDTO {
	
	String deviceid;
	String time;
	int dbp;
	int sbp;
	
}
