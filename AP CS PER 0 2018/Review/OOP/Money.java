package OOP;

public class Money { 
	// instance variables 
	private int myDollars; 
	private int myCents; 
		
	// constructors
	public Money() {
		myDollars = 0;
		myCents = 0;
	}

	public Money(int dollars, int cents) { 
		if(cents > 99) {
			dollars += (cents / 100);
			cents %= 100;
		}
		
		this.myDollars = dollars;
		this.myCents = cents;
		

		
	}

	// methods 
	// preconditions: Money object has been constructed //
	// postconditions: returns the value held in myDollars
	public int getDollars() {
		return myDollars;
	}

	// preconditions: Money object has been constructed // postconditions: returns
	// the value held in myCents
	public int getCents() {
		return myCents;
	}
	
	// preconditions: Money object has been constructed //
	// postconditions: returns the Money object as a String // Also consider if
	// myCents is a one digit value
	public String toString() {
		return (myCents > 9) ? "$" + myDollars + "." + myCents : "$" + myDollars + ".0" + myCents;
	}

	// preconditions: Money object has been constructed // postconditions: prints
	// the value of the Money object // using the fewest number of bills and //
	// coins possible.
	public void getAndPrintDetails() {
		int hundreds = 0, fifties = 0, twenties = 0, tens = 0, fives = 0, ones = 0;
		int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
		
		int dollars = myDollars;
		int cents = myCents;
		
		
		if(dollars >= 5 || cents >= 5) {
			hundreds += dollars / 100;
			dollars %= 100;
			
			fifties += dollars / 50;
			dollars %= 50;
			
			twenties += dollars / 20;
			dollars %= 20;
			
			tens += dollars / 10;
			dollars %= 10;
			
			fives += dollars / 5;
			dollars %= 5;
			
			ones = dollars;
		
			quarters += cents / 25;
			cents %= 25;
			
			dimes += cents / 10;
			cents %= 10;
			
			nickels += cents / 5;
			cents %= 5;
			
			pennies = cents;
		}
		
		
		
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
		
		return new Money(myDollars + dollars, myCents + cents);
	}

	// preconditions: Money object has been constructed // postconditions: returns
	// the sum of this and theMoney // Is this accessor, mutator, or neither? public
	//
	public Money add(Money theMoney) {
		
		return add(theMoney.getDollars(), theMoney.getCents());
	}
}