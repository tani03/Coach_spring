package coach;
public class Football implements Coach {
	private EquipmentService es;//private field for dependenc y
	
	
	public Football(EquipmentService es) {
		
		this.es = es;
	}

	@Override
	public String toDoTask() {
		// TODO Auto-generated method stub
		return "foot exercise";
	}

	@Override
	public String getYearlyData() {
		// TODO Auto-generated method stub
		return "Just do it"+es.sendEquipment();
	}
	//add an init method
	 public void doMyStartupStuff() {
		 System.out.println("Inside init of trackcoach");
	 }
	//add a destroy method
	 public void doMyCleanupStuff() {
		 System.out.println("Inside destroyer ");
	 }
}
