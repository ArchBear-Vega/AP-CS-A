package OOP;

public class Money { 
	// instance variables 
	private int myDollars; 
	private int myCents; 
		
	// constructors
	public Money() {

	}

	public Money(int dollars, int cents) { 

	}

	// methods 
	// preconditions: Money object has been constructed //
	// postconditions: returns the value held in myDollars
	public int getDollars() {
	
	}

	// preconditions: Money object has been constructed // postconditions: returns
	// the value held in myCents
	public int getCents() {
		
	}
	
	// preconditions: Money object has been constructed //
	// postconditions: returns the Money object as a String // Also consider if
	// myCents is a one digit value
	public String toString() {
		
	}

	// preconditions: Money object has been constructed // postconditions: prints
	// the value of the Money object // using the fewest number of bills and //
	// coins possible.
	public void getAndPrintDetails() {
		int hundreds, fifties, twenties, tens, fives, ones;
		int quarters, dimes, nickels, pennies;
		System.out.println("\t" + hundreds + " hundreds");
		System.out.println("\t" + fifties + " fifties");
		System.out.println("\t" + twenties + " twenties");
		System.out.println("\t" + tens + " tens");
		System.out.println("\t" + fives + " fives");
		System.out.println("\t" + ones + " ones");
		System.out.println("\t" + quarters + " quarters");
		System.out.println("\t" + dimes + " dimes");
		System.out.println("\t" + nickels + " nickels");
		System.out.println("\t" + pennies + " pennies");
	}


	// calculate the values of each of the local variables

	// preconditions: Money object has been constructed // postconditions: returns
	// the sum of this // and dollars, cent // Is this accessor, mutator, or
	// neither?
	public Money add(int dollars, int cents) {
		
	}

	// preconditions: Money object has been constructed // postconditions: returns
	// the sum of this and theMoney // Is this accessor, mutator, or neither? public
	//
	public Money add(Money theMoney) {
		
	}
}