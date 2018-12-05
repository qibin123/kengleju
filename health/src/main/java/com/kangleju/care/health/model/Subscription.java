package com.kangleju.care.health.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "subscriptions")
@Builder
public class Subscription {
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
	String clinicType;
	String registrationDate;
	String registrationTime;
	String clinicFee;

	//response
	String subscriptionId;
	String amount;
	
	//status: 0: created 1:canceled
	String status;

	
}
