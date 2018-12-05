package com.kangleju.care.iotservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReturnStatus {
	public static ReturnStatus Success = ReturnStatus.builder().success(true).build();
	public static ReturnStatus Failed = ReturnStatus.builder().success(false).build();
	
	boolean success;
}
