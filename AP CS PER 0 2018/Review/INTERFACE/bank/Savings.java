package INTERFACE.bank;

public class Savings implements Account {

	private double balance;
	private double intRate;

	public Savings() {
		balance = 1000;
		intRate = .1;
	}

	public Savings(double balance, double intRate) {
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

	}

	@Override
	public double withdraw(double amount) {
		balance -= amount;

		return amount;

	}

	@Override
	public void compound() {
		deposit(balance * (1 + intRate) - balance);
	}

	@Override
	public String toString() {
		String s = new String("Savings Account");
		String b = new String("Balance : $" + balance);
		return s + "\n" + b;
	}

	@Override
	public int compareTo(Account o) {
		if (o.getBalance() != balance) {
			return (balance > o.getBalance()) ? 1 : -1;

		}

		return 0;

	}

}
