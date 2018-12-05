package com.kangleju.care.iotservice.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import com.kangleju.care.iotservice.config.ServiceConfig;
import com.kangleju.care.iotservice.dto.BloodPressureDTO;
import com.kangleju.care.iotservice.dto.FallDTO;
import com.kangleju.care.iotservice.dto.FenceDTO;
import com.kangleju.care.iotservice.dto.HeartRateDTO;
import com.kangleju.care.iotservice.dto.SOSDTO;
import com.kangleju.care.iotservice.dto.SleepDTO;
import com.kangleju.care.iotservice.dto.StepsDTO;
import com.kangleju.care.iotservice.model.BloodPressureData;
import com.kangleju.care.iotservice.model.FallData;
import com.kangleju.care.iotservice.model.HeartRateData;
import com.kangleju.care.iotservice.model.MessageData;
import com.kangleju.care.iotservice.model.PositionData;
import com.kangleju.care.iotservice.model.PushData;
import com.kangleju.care.iotservice.model.ReturnStatus;
import com.kangleju.care.iotservice.model.SOSData;
import com.kangleju.care.iotservice.model.SleepData;
import com.kangleju.care.iotservice.model.StepsData;
import com.kangleju.care.iotservice.repository.BloodPressureDataRepository;
import com.kangleju.care.iotservice.repository.FallDataRepository;
import com.kangleju.care.iotservice.repository.HeartRateDataRepository;
import com.kangleju.care.iotservice.repository.MessageDataRepository;
import com.kangleju.care.iotservice.repository.PositionDataRepository;
import com.kangleju.care.iotservice.repository.PushDataRepository;
import com.kangleju.care.iotservice.repository.SOSDataRepository;
import com.kangleju.care.iotservice.repository.SleepDataRepository;
import com.kangleju.care.iotservice.repository.StepsDataRepository;

@Service
public class PushDataService {
	@Autowired
	IOTSource iotSource;
	
	@Autowired
	ServiceConfig serviceConfig;

	@Autowired
	BloodPressureDataRepository bloodPressureDataRepository;
	
	@Autowired
	FallDataRepository fallDataRepository;
	
	@Autowired
	HeartRateDataRepository heartRateDataRepository;
	
	@Autowired
	MessageDataRepository messageDataRepository;
	
	@Autowired
	PositionDataRepository positionDataRepository;
	
	@Autowired
	PushDataRepository pushDataRepository;
	
	@Autowired
	SleepDataRepository sleepDataRepository;
	
	@Autowired
	SOSDataRepository sosDataRepository;
	
	@Autowired
	StepsDataRepository stepsDataRepository;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public ReturnStatus saveBloodPressureData(BloodPressureData bloodPressureData) {
		try {
			if(bloodPressureData != null && bloodPressureData.getImei() != null && !bloodPressureData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) bloodPressureDataRepository.save(bloodPressureData);
				
				//build DTO
				BloodPressureDTO dto = BloodPressureDTO.builder().deviceid(bloodPressureData.getImei()).dbp(bloodPressureData.getDbp())
						.sbp(bloodPressureData.getSbp()).time(bloodPressureData.getTime_begin()).build();

				iotSource.bloodPressure().send(MessageBuilder.withPayload(dto).build());
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}
	
	public ReturnStatus saveFallData(FallData fallData) {
		try {
			if(fallData != null && fallData.getImei() != null && !fallData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) fallDataRepository.save(fallData);
				
				FallDTO dto = FallDTO.builder().deviceid(fallData.getImei()).city(fallData.getCity())
						.address(fallData.getAddress()).latitude(fallData.getLat()).longitude(fallData.getLon())
						.time(fallData.getTime_begin()).build();
				iotSource.fall().send(MessageBuilder.withPayload(dto).build());
				
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}	
	
	public ReturnStatus saveHeartRateData(HeartRateData heartRateData) {
		try {
			if(heartRateData != null && heartRateData.getImei() != null && !heartRateData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) heartRateDataRepository.save(heartRateData);
				
				HeartRateDTO dto = HeartRateDTO.builder().deviceid(heartRateData.getImei()).heartrate(heartRateData.getHeartrate())
						.time(heartRateData.getTime_begin()).build();
				
				iotSource.heartRate().send(MessageBuilder.withPayload(dto).build());
				
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}			
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}
	
	public ReturnStatus saveMessageData(MessageData messageData) {
		try {
			if(messageData != null && messageData.getDeviceid() != null && !messageData.getDeviceid().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) messageDataRepository.save(messageData); 
				
				//only send fence violation
				if(messageData.getType().equals("4")) {
					Date now = new Date();
					FenceDTO dto = FenceDTO.builder().deviceid(messageData.getDeviceid()).time(sdf.format(now)).build();
					iotSource.fence().send(MessageBuilder.withPayload(dto).build());
				}
				
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}	
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}
	
	public ReturnStatus savePositionData(PositionData positionData) {
		try {
			if(positionData != null && positionData.getImei() != null && !positionData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) positionDataRepository.save(positionData); //ignore them by now
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}				

		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}
	
	public ReturnStatus savePushData(PushData pushData) {
		try {
			if(serviceConfig.isSaveMsgFlag()) pushDataRepository.save(pushData); //ignore 
			return ReturnStatus.Success;
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}
	
	public ReturnStatus saveSleepData(SleepData sleepData) {
		try {
			if(sleepData != null && sleepData.getImei() != null && !sleepData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) sleepDataRepository.save(sleepData);
				
				SleepDTO dto = SleepDTO.builder().deviceid(sleepData.getImei()).timeBegin(sleepData.getTime_begin()).timeEnd(sleepData.getTime_end())
						.data(sleepData.getData()).interval(sleepData.getInterval()).build();
				iotSource.sleep().send(MessageBuilder.withPayload(dto).build());
				
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}						
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}
	
	public ReturnStatus saveStepsData(StepsData stepsData) {
		try {
			if(stepsData != null && stepsData.getImei() != null && !stepsData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) stepsDataRepository.save(stepsData);
				
				StepsDTO dto = StepsDTO.builder().deviceid(stepsData.getImei()).time(stepsData.getTime_begin()).value(stepsData.getValue()).build();
				
				iotSource.steps().send(MessageBuilder.withPayload(dto).build());
				
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}			
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}	
	
	public ReturnStatus saveSosData(SOSData sosData) {
		try {
			if(sosData != null && sosData.getImei() != null && !sosData.getImei().isEmpty() ) {	
				if(serviceConfig.isSaveMsgFlag()) sosDataRepository.save(sosData);
				
				SOSDTO dto = SOSDTO.builder().deviceid(sosData.getImei()).city(sosData.getCity()).address(sosData.getAddress()).heartrate(sosData.getHeartrate())
						.latitude(sosData.getLat()).longitude(sosData.getLon()).build();
				
				iotSource.sos().send(MessageBuilder.withPayload(dto).build());
				
				return ReturnStatus.Success;
			}
			else {
				return ReturnStatus.Failed;
			}			
		}
		catch(Exception ex) {
			return ReturnStatus.Failed;
		}
	}	
}
