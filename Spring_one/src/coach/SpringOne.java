package coach;
//https://stackoverflow.com/questions/32451718/warning-exception-encountered-during-context-initialization-cancelling-refres/61457053#61457053
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringOne {

	public static void main(String[] args) {
		//load config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("footballCoach",Coach.class);
		System.out.println(theCoach.toDoTask());//sysout ctrl+space	
		System.out.println(theCoach.getYearlyData());
		
		Coach theCoachGolf=context.getBean("golfCoach",Coach.class);
		System.out.println(theCoachGolf.toDoTask());
		System.out.println(theCoachGolf.getYearlyData());
		
		context.close();
	}

}
