package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "PushData")
@Builder
public class PushData {
	@Id
	String id;
	String type;
	
	String data;
}
