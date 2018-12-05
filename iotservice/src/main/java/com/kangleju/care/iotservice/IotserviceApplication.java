package com.kangleju.care.iotservice;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.kangleju.care.iotservice.service.IOTSource;

//import com.kangleju.care.iotservice.model.DevicePosition;
//import com.kangleju.care.iotservice.service.ServiceAdapter;

@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
@EnableBinding(IOTSource.class)
public class IotserviceApplication {
	//@Autowired 
	//ServiceAdapter serviceAdapter;

	public static void main(String[] args) {
		SpringApplication.run(IotserviceApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner(){
      return args -> {
    	  /*
    	  List<DevicePosition> positions = serviceAdapter.getLocationHistory("866815030281848");
    	  
    	  for(DevicePosition pos : positions ) {
    		  System.out.println(pos.getTimeBegin());
    		  System.out.println(pos.getCreateAt());
    		  System.out.println(pos.getAddress());
    		  System.out.println(pos.getLatitude());
    		  System.out.println(pos.getLongitude());
    	  } */
    	  
    	  //serviceAdapter.getDeviceInfo("866815030281848");
      };
      
    }
}
