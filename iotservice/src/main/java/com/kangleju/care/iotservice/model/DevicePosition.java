package com.kangleju.care.iotservice.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DevicePosition {
	Date createAt;
	Date timeBegin;
	String city;
	String address;
	double longitude;
	double latitude;
}
