package com.taniya.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		System.out.println("heya");
		//retrieve spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		Coach.words();
		
		//call method to get the daily fortune
		System.out.println(theCoach.getYearlyData());
		context.close();
		//close the container

	}

}
