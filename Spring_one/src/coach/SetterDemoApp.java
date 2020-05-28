package coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring conteiner
		CricketCoach theCoach=context.getBean("cricketcoach",CricketCoach.class);
		//call methods on bean
		System.out.println(theCoach.toDoTask());
		System.out.println(theCoach.getYearlyData());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
	}

}
