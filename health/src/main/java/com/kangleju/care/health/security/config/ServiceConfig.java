package com.kangleju.care.health.security.config;

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
}
