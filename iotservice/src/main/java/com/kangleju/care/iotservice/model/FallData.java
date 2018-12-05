package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "FallData")
@Builder
public class FallData {
	@Id
	String id;

	String imei;
	String time_begin;
	String city;
	String address;
	double lon;
	double lat;
	String type; //0:Gps定位; 1:基站定位       |

}
