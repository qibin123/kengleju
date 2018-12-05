package com.kangleju.care.health.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SleepDTO {

	String deviceid;
	String timeBegin;
	String timeEnd;
	int interval;
	int total;
	String data; //睡眠数据 （格式： state,turn_over|state,turn_over|state, ... state和turn_over的含义见object.md 文档中 sleepdatasleep)	
}
