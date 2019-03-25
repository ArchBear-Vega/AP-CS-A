package ABSTRACT;

public class Checking extends BankAccount {

	private int transactions;

	public Checking(double balance, double d) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		transactions++;
		if (transactions <= 4) {
			chargeFee();
		}
	}

	private void chargeFee() {
		// TODO Auto-generated method stub
		super.withdraw(getBalance() * .005);
		transactions = 0;

	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		transactions++;
		if (transactions <= 4) {
			chargeFee();
		}
	}

}
