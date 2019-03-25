package INTERFACE.bank;

public interface Account extends Comparable<Account>{

	public double getBalance();

	public void deposit(double amount);

	public double withdraw(double amount);
	
	public void compound();
		
	
}
