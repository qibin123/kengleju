package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kangleju.care.health.dto.HeartRateDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "heartratedata")
@Builder
public class HeartRateData {
	@Id
	String id;

	String customerUuid;
	String orgUuid;
	
	int rate;
	
	String time;
	
	String date;
	
	List<HeartRateDTO> dataPoints;

	
	
	
}
