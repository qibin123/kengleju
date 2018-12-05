package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kangleju.care.health.dto.FallDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "falldata")
@Builder
public class FallData {
	@Id
	String id;

	String customerUuid;
	String orgUuid;
	
	int count;
	
	String date;
	
	List<FallDTO> dataPoints;
	
}
