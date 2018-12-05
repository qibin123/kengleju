package com.kangleju.care.health.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FallDTO {

	String deviceid;
	String time;
	String city;
	String address;
	double longitude;
	double latitude;

}
