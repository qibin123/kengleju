package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "SleepData")
@Builder
public class SleepData {
	@Id
	String id;
	
	String imei;
	String time_begin;
	String time_end;
	int interval;
	int total;
	String data; //睡眠数据 （格式： state,turn_over|state,turn_over|state, ... state和turn_over的含义见object.md 文档中 sleepdatasleep)	
}
