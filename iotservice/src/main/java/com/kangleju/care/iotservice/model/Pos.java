package com.kangleju.care.iotservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pos {
	double longitude;
	double latitude;
}
