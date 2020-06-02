package com.taniya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
private EquipmentService es;

	/*
	@Autowired
	public TennisCoach(EquipmentService es) {
	this.es = es;
	}*/
	
	@Autowired	
	public EquipmentService getEs(EquipmentService es) {
	this.es=es;
	return es;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice everyday 10 runs";
	}

	

	@Override
	public String getYearlyData() {
		return es.getEquipments();
	}

}
