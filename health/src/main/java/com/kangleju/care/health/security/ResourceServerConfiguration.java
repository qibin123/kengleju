package com.kangleju.care.health.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers(HttpMethod.DELETE, "/v1/customers/**").hasRole("ADMIN")
			//.antMatchers(HttpMethod.POST, "/v1/customers/**").hasRole("ADMIN") //customer can edit their own details
			.antMatchers(HttpMethod.PUT, "/v1/customers/**").hasRole("ADMIN")
			.anyRequest().authenticated();
	}
}
