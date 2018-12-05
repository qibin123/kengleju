package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kangleju.care.health.dto.StepsDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "stepsdata")
@Builder
public class StepsData {
	@Id
	String id;

	String orgUuid;
	String customerUuid;
	
	int value;
	
	String time;
	
	String date;
	
	List<StepsDTO> dataPoints;
}
