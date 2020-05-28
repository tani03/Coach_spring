package coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach=context.getBean("footballCoach",Coach.class);
		
	
		
		System.out.println(theCoach.getYearlyData());	
		
		context.close();
	}
	

}
