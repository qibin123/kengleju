package com.kangleju.care.health.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

//only senior, not family members
@Data
@Document(collection = "customers")
@Builder
public class Customer {
	  @Id
	  String id;

	  String uuid;
	  
	  String firstname;
	  String lastname;
	  
	  String orgUuid;
	  String orgName;
	  
	  String trackingDeviceId;
	  
	  List<String> assignedDevices;
	  
}