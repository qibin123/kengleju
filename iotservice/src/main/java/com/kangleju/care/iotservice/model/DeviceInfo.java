package com.kangleju.care.iotservice.model;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeviceInfo {
	String imei;
	String lastCity;
	String lastAddress;
	Date lastUpdate;
	String sosNumber;
	List<Pos> fence;
	Pos point;
}
