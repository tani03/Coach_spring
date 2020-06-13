package com.taniya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.taniya.spring")
public class SportConfig {
	
	@Bean
	public EquipmentService swimSuitService() {
		return new SwimSuitService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(swimSuitService());
	}
	
	
}
