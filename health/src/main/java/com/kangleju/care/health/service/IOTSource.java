package com.kangleju.care.health.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IOTSource {
	String STEPS = "steps";
	String BLOODPRESSURE = "bloodpressure";
	String FALL = "fall";
	String SLEEP = "sleep";
	String SOS = "sos";
	String HEARTRATE = "heartrate";
	String FENCE = "fence";
		

	@Input(IOTSource.STEPS)
	SubscribableChannel steps();
    
	@Input(IOTSource.BLOODPRESSURE)
    SubscribableChannel bloodPressure();
    
	@Input(IOTSource.FALL)
    SubscribableChannel fall();
    
	@Input(IOTSource.SLEEP)
    SubscribableChannel sleep();
    
	@Input(IOTSource.SOS)
    SubscribableChannel sos();
    
	@Input(IOTSource.HEARTRATE)
    SubscribableChannel heartRate();
    
	@Input(IOTSource.FENCE)
    SubscribableChannel message();

}