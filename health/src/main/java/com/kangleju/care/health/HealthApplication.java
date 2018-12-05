package com.kangleju.care.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import com.kangleju.care.health.model.Register;
//import com.kangleju.care.health.model.Subscription;
import com.kangleju.care.health.service.HealthService;
import com.kangleju.care.health.service.IOTDataProcessor;
import com.kangleju.care.health.service.IOTSource;

@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
@EnableBinding(value = {IOTSource.class, IOTDataProcessor.class})
public class HealthApplication {

	@Autowired
	HealthService healthService;
	
	public static void main(String[] args) {
		SpringApplication.run(HealthApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner(){
      return args -> {
    	  //healthService.getHealthMonitoringData("be21c292-7308-47a7-8101-d3a831b8852a");
    	  /*
    	  Register register = Register.builder().uuid("ca0af345-b8d4-4665-800f-b1acce49264a").patientUuid("be21c292-7308-47a7-8101-d3a831b8852a").status("0")
    			  .amount("15").clinicFee("15").departmentCode("01030200").departmentName("消化内科")
    			  .doctorCode("00000954").doctorName("张谦").orgUuid("60af7936-9278-11e8-9eb6-529269fb1459")
    			  .realName("康乐居").idCard("360428197402084563").patientCard("300000040").registerId("be36d10825584bdd8597a95bbcf56f4e")
    			  .hosiptalName("陕西省核工业215医院").hospitalUuid("39f93111-f283-4311-b172-65a575c26219").scheduleId("400000086")
    			  .registrationDate("2018-11-03").registrationTime("9:00-10:00")
    			  .build();  

    	  if(healthService.findRegisterByUuid("ca0af345-b8d4-4665-800f-b1acce49264a") == null) {
    		  healthService.saveRegister(register);
    	  }
    	  
    	  if(healthService.findRegisterByUuid("1d296fbe-cc86-4659-a5f0-e36e0fc50cf2") == null) {
	    	  register.setId(null);
	    	  register.setUuid("1d296fbe-cc86-4659-a5f0-e36e0fc50cf2");
	    	  register.setDepartmentCode("01030200");
	    	  register.setDepartmentName("消化内科");
	    	  register.setDoctorCode("00000964");
	    	  register.setDoctorName("董增辉");
	    	  register.setRegisterId("be36d10e25584bdd9586a95bacf56f4e");
	    	  register.setRegistrationDate("2018-11-07");
	    	  register.setRegistrationTime("11:00-12:00");
	    	  register.setStatus("1");
	    	  healthService.saveRegister(register);
    	  }
    	  
    	  if(healthService.findRegisterByUuid("dfc0ebd2-733e-4f01-9725-b1a26fd4902c") == null) {
	    	  register.setId(null);
	    	  register.setUuid("dfc0ebd2-733e-4f01-9725-b1a26fd4902c");
	    	  register.setDepartmentCode("01030100");
	    	  register.setDepartmentName("呼吸内科");
	    	  register.setDoctorCode("00000383");
	    	  register.setDoctorName("马小安");
	    	  register.setRegisterId("be36d10e23986bdd9586a95bacf56f4e");
	    	  register.setRegistrationDate("2018-11-16");
	    	  register.setRegistrationTime("15:00-16:00");
	    	  register.setStatus("0");
	    	  healthService.saveRegister(register);
    	  }
    	  
    	  Subscription subscription = Subscription.builder().uuid("8b21ce00-4772-4c51-bb2b-9f7ecc7e846b").patientUuid("be21c292-7308-47a7-8101-d3a831b8852a").status("0")
    			  .amount("15").clinicFee("15").departmentCode("01031000").departmentName("老年病科")
    			  .doctorCode("00000511").doctorName("苏海燕").orgUuid("60af7936-9278-11e8-9eb6-529269fb1459")
    			  .realName("康乐居").idCard("360428197402084563").patientCard("300000040")
    			  .subscriptionId("be36d10825584bdd8597a95332f56f4e")
    			  .hosiptalName("陕西省核工业215医院").hospitalUuid("39f93111-f283-4311-b172-65a575c26219").scheduleId("400000086")
    			  .clinicType("专家门诊").registrationDate("2018-11-02").registrationTime("9:00-10:00")
    			  .build();  

    	  if(healthService.findSubscriptionByUuid("8b21ce00-4772-4c51-bb2b-9f7ecc7e846b") == null) {
    		  healthService.saveRSubscription(subscription);
    	  }
    	  
    	  if(healthService.findSubscriptionByUuid("9760be84-d17c-45f7-abc8-bc73d458f068") == null) {
    		  subscription.setId(null);
    		  subscription.setUuid("9760be84-d17c-45f7-abc8-bc73d458f068");
    		  subscription.setDepartmentCode("01040301");
    		  subscription.setDepartmentName("骨科(关节)");
    		  subscription.setDoctorCode("00000345");
    		  subscription.setDoctorName("王延军");
    		  subscription.setSubscriptionId("be36d10e25584bdd1234a95bacf56f4e");
    		  subscription.setRegistrationDate("2018-11-06");
    		  subscription.setRegistrationTime("10:00-11:00");
    		  subscription.setStatus("0");
	    	  healthService.saveRSubscription(subscription);
    	  }
    	  
    	  if(healthService.findSubscriptionByUuid("a430aa42-3c92-4b48-aa6d-869ca84a2ecc") == null) {
    		  subscription.setId(null);
    		  subscription.setUuid("a430aa42-3c92-4b48-aa6d-869ca84a2ecc");
    		  subscription.setDepartmentCode("01030200");
    		  subscription.setDepartmentName("消化内科");
    		  subscription.setDoctorCode("00000974");
    		  subscription.setDoctorName("李雅萍");
    		  subscription.setSubscriptionId("be36d10345684bdd1234a95bacf56f4e");
    		  subscription.setRegistrationDate("2018-11-23");
    		  subscription.setRegistrationTime("9:00-10:00");
    		  subscription.setStatus("1");
	    	  healthService.saveRSubscription(subscription);
    	  }
    	  */
      };
	}
}
