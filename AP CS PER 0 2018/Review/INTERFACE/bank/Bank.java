package INTERFACE.bank;

public class Bank {
	public static void main(String[] args) {
		
		
		Savings s = new Savings(1000000, .02);
		Checking c = new Checking(5000, .0002);
		
	
		System.out.println(s);
		System.out.println(s.compareTo(c));
	}
}
