package com.kangleju.care.health.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;


@Data
@Document(collection = "registers")
@Builder
public class Register {
	@Id
	String id;
	String uuid;
	
	String orgUuid;
	String patientUuid;
	
	String hospitalUuid;
	String hosiptalName;

	//reqeust
	String scheduleId;
	String realName;
	String idCard;
	String patientCard;
	String departmentName;
	String departmentCode;
	String doctorName;
	String doctorCode;
	String registrationDate;
	String registrationTime;
	String clinicFee;
	
	//response
	String registerId;
	String amount;
	
	//status: 0: 
	String status;
	
}
