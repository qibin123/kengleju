package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kangleju.care.health.dto.SOSDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "sosdata")
@Builder
public class SOSData {
	@Id
	String id;

	String orgUuid;
	String customerUuid;
	
	int count;
	
	String date;
	
	List<SOSDTO> dataPoints;
}
