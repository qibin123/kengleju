package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "PositionData")
@Builder
public class PositionData {
	@Id
	String id;
	
	String imei; //15位设备唯一序号
	String time_begin; //发生时间YYYY-MM-DD HH:mm:SS.xxxxxx
	Boolean is_reply;
	Boolean is_track;
	String city;
	String address;
	double lon;
	double lat;
	String type; //类型   0:Gps定位; 1:基站定位
}
