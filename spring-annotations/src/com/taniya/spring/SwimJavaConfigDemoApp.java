package com.taniya.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		System.out.println("heya");
		//read spring config java file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from container
		Coach theCoach=context.getBean("swimCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		Coach.words();
		
		//call method to get the daily fortune
		System.out.println(theCoach.getYearlyData());
		context.close();
		//close the container

	}

}
