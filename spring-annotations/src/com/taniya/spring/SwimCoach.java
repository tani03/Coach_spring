package com.taniya.spring;

public class SwimCoach implements Coach {

	private EquipmentService service;
	
	public SwimCoach(EquipmentService es) {
		service=es;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swim 100 meters as warm up";
	}

	@Override
	public String getYearlyData() {
		return service.getEquipments();
	}

}
