package ABSTRACT;

public abstract class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public String toString() {
		return "\n Balance : " + balance;
	}

}
