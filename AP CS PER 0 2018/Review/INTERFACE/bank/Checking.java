package INTERFACE.bank;

public class Checking implements Account {
	
	private double balance;
	private double intRate;
	private int transactions;
	
	
	public Checking() {
		balance = 1000;
		intRate = .001;
	}
	
	public Checking(double balance, double intRate) {
		this.balance = balance;
		this.intRate = intRate;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		transactions++;
		chargeFee();
	}

	@Override
	public double withdraw(double amount) {
		balance -= amount;
		transactions++;
		chargeFee();
		return amount;
	}

	@Override
	public void compound() {
		deposit(balance * 1 + intRate);
		
	}
	
	public void chargeFee() {
		if(transactions > 4) {
			withdraw(balance * .005);
			transactions = 0;
		}
	}
	
	@Override
	public String toString() {
		String s = new String("Checking Account");
		String b = new String("Balance : $" + balance);
		return s + "\n" + b;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
