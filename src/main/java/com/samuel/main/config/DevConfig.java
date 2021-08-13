package com.samuel.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.samuel.main.service.DataBaseService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private DataBaseService baseService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public void instanceDataBase() {
		if(strategy.equals("create")) {
			this.baseService.instanceDB();
		}
	}
}
