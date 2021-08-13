package com.samuel.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.samuel.main.service.DataBaseService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DataBaseService baseService;
	
	@Bean
	public void instanceDataBase() {
		this.baseService.instanceDB();
	}
}
