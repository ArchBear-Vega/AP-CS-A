package ABSTRACT;

public class Savings extends BankAccount {
	
	private double intRate;
	
	public Savings(double balance, double d) {
		super(balance);
		// TODO Auto-generated constructor stub
		this.setIntRate(d);
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}
	
	public void compound() {
		deposit(getBalance() * (1 + getIntRate()));
	}
	
	@Override()
	public String toString() {
		return "Savings Account" + super.toString();
	}

}
