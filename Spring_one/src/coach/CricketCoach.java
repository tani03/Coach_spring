package coach;

public class CricketCoach implements Coach {

	private EquipmentService es;
	private String email;
	private String team;
	
	public void setEs(EquipmentService es) {
		System.out.println("Inside setter method,inside cricket coach");
		this.es = es;
	}

	
	public void setEmail(String email) {
		System.out.println("Inside setter method,inside cricket coach,setemailaddress");

		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter method,inside cricket coach: team");

		this.team = team;
	}

	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String toDoTask() {
		return "Practice fast bowling";
	}

	@Override
	public String getYearlyData() {
		return es.sendEquipment();
	}

}
