package com.kangleju.care.iotservice.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface IOTSource {
	String STEPS = "steps";
	String BLOODPRESSURE = "bloodpressure";
	String FALL = "fall";
	String SLEEP = "sleep";
	String SOS = "sos";
	String HEARTRATE = "heartrate";
	String FENCE = "fence";
	

    @Output(IOTSource.STEPS)
    MessageChannel steps();
    
    @Output(IOTSource.BLOODPRESSURE)
    MessageChannel bloodPressure();
    
    @Output(IOTSource.FALL)
    MessageChannel fall();
    
    @Output(IOTSource.SLEEP)
    MessageChannel sleep();
    
    @Output(IOTSource.SOS)
    MessageChannel sos();
    
    @Output(IOTSource.HEARTRATE)
    MessageChannel heartRate();
    
    @Output(IOTSource.FENCE)
    MessageChannel fence();
}