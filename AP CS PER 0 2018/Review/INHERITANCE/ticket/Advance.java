package INHERITANCE.ticket;

public class Advance extends Ticket{

	
	protected int daysAdvance;
	
	public Advance(int daysAdvance) {
		this.daysAdvance = daysAdvance;
	}
	
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return daysAdvance < 10 ? 40 : 30;
	}

}
