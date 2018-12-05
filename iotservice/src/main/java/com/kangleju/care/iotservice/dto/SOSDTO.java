package com.kangleju.care.iotservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SOSDTO {
	
	String deviceid;
	String time;
	int heartrate;
	String city;
	String address;
	double longitude;
	double latitude;

}
