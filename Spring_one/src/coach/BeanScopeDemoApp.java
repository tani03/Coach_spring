package coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach=context.getBean("footballCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("footballCoach",Coach.class);
		//check if these are same beans
		boolean result=(theCoach==alphaCoach);
		System.out.println("pointing to same object "+ result);
		System.out.println("memory Location for theCoach " +theCoach);
		System.out.println("memory Location for theCoach " +alphaCoach);
		
		context.close();
	}
	

}
