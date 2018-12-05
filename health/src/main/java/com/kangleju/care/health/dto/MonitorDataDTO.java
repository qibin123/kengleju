package com.kangleju.care.health.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MonitorDataDTO {
	String[] bloodPressureDate;
	int[] bloodPressureDbp;
	int[] bloodPressureSbp;
	
	String[] stepsDate;
	int[] stepsValue;
	
	String[] heartRateDate;
	int[] heartRateRate;
}
