package com.kangleju.care.iotservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {
  
  @Value("${signing.publickey}")
  private String jwtPublicKey="";

  public String getJwtPublicKey() {
    return jwtPublicKey;
  }
  
  @Value("${backend.resourceUrl}")
  String resourceUrl="";
  
  public String getResourceUrl() {
	  return resourceUrl;
  }
  
  @Value("${backend.user}")
  String user="";
  
  public String getUser() {
	    return user;
	  }
  
  @Value("${backend.password}")
  String password="";
  
  public String getPassword() {
	    return password;
	  }
  
  @Value("${message.save}")
  Boolean saveMsgFlag=false;
  
  public Boolean isSaveMsgFlag() {
    return saveMsgFlag;
  }
}