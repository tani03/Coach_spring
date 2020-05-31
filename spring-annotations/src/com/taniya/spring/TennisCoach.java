package com.taniya.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice everyday 10 runs";
	}

}
