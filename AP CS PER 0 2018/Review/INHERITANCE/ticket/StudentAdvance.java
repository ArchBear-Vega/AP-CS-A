package INHERITANCE.ticket;

public class StudentAdvance extends Advance {

	public StudentAdvance(int daysAdvance) {
		super(daysAdvance);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double getPrice() {
		return daysAdvance < 10 ? 20 : 15;
	}
	
}
