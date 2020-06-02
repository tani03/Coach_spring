package com.taniya.spring;

import org.springframework.stereotype.Component;

@Component
public class BallService implements EquipmentService {

	@Override
	public String getEquipments() {
		return "10 balls each months";
	}

	
	}


