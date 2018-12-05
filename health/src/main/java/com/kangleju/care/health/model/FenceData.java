package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kangleju.care.health.dto.FenceDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "fencedata")
@Builder
public class FenceData {
	@Id
	String id;

	String customerUuid;
	String orgUuid;
	
	int count;
	
	String date;
	
	List<FenceDTO> dataPoints;
	
}
