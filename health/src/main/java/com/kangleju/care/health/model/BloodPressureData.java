package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kangleju.care.health.dto.BloodPressureDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "bloodpressuredata")
@Builder
public class BloodPressureData {
	@Id
	String id;

	String customerUuid;
	String orgUuid;
	
	int dbp;
	int sbp;
	
	String time;
	
	String date;
	
	List<BloodPressureDTO> dataPoints;
	
}
