package com.kangleju.care.iotservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FenceDTO {
	String deviceid;
	String time;
}
