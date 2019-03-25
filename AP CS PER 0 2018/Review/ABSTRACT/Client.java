package ABSTRACT;

public class Client {
	public static void main(String[] args) {
		BankAccount a;
		Savings s = new Savings(1000000.0, .02);
		Checking c = new Checking(5000, .0002);
		a = s;
	}
}
