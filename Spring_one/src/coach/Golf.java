package coach;
public class Golf implements Coach {
	private EquipmentService es;
	
	
	public Golf(EquipmentService es) {
		super();
		this.es = es;
	}

	@Override
	public String toDoTask() {
		// TODO Auto-generated method stub
		String s="IDK";
		return s;
	}

	@Override
	public String getYearlyData() {
		// TODO Auto-generated method stub
		return "You need"+es.sendEquipment()+"for golf";
	}

}
