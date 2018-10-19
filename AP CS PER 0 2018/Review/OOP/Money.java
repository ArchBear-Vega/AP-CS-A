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
/*
RUN 1 ==============================

Fewest number of bills and coins (money 1) 
	0 hundreds
	0 fifties
	0 twenties
	1 tens
	0 fives
	0 ones
	2 quarters
	0 dimes
	1 nickels
	4 pennies
Adding money1 and money2 calling first add method:
	$10.59 + $20.70 = $31.29
Fewest number of bills and coins (money 3) 
	0 hundreds
	0 fifties
	1 twenties
	1 tens
	0 fives
	1 ones
	1 quarters
	0 dimes
	0 nickels
	4 pennies
Adding money1 and money2 calling second add method:
	$10.59 + $20.70 = $31.29
USER INPUT:
First money
dollars = 20
cents = 0
Second money
dollars = 20
cents = 0
Fewest number of bills and coins (money 1) 
	0 hundreds
	0 fifties
	1 twenties
	0 tens
	0 fives
	0 ones
	0 quarters
	0 dimes
	0 nickels
	0 pennies
Adding money1 and money2 calling first add method:
	$20.00 + $20.00 = $40.00
Fewest number of bills and coins (money 3) 
	0 hundreds
	0 fifties
	2 twenties
	0 tens
	0 fives
	0 ones
	0 quarters
	0 dimes
	0 nickels
	0 pennies
Adding money1 and money2 calling second add method:
	$20.00 + $20.00 = $40.00


RUN 2 ======================================

Fewest number of bills and coins (money 1) 
	0 hundreds
	0 fifties
	0 twenties
	1 tens
	0 fives
	0 ones
	2 quarters
	0 dimes
	1 nickels
	4 pennies
Adding money1 and money2 calling first add method:
	$10.59 + $20.70 = $31.29
Fewest number of bills and coins (money 3) 
	0 hundreds
	0 fifties
	1 twenties
	1 tens
	0 fives
	1 ones
	1 quarters
	0 dimes
	0 nickels
	4 pennies
Adding money1 and money2 calling second add method:
	$10.59 + $20.70 = $31.29
USER INPUT:
First money
dollars = 0
cents = 1000
Second money
dollars = 1000
cents = 1000
Fewest number of bills and coins (money 1) 
	0 hundreds
	0 fifties
	0 twenties
	1 tens
	0 fives
	0 ones
	0 quarters
	0 dimes
	0 nickels
	0 pennies
Adding money1 and money2 calling first add method:
	$10.00 + $1010.00 = $1020.00
Fewest number of bills and coins (money 3) 
	10 hundreds
	0 fifties
	1 twenties
	0 tens
	0 fives
	0 ones
	0 quarters
	0 dimes
	0 nickels
	0 pennies
Adding money1 and money2 calling second add method:
	$10.00 + $1010.00 = $1020.00

RUN 3 ===================================

Fewest number of bills and coins (money 1) 
	0 hundreds
	0 fifties
	0 twenties
	1 tens
	0 fives
	0 ones
	2 quarters
	0 dimes
	1 nickels
	4 pennies
Adding money1 and money2 calling first add method:
	$10.59 + $20.70 = $31.29
Fewest number of bills and coins (money 3) 
	0 hundreds
	0 fifties
	1 twenties
	1 tens
	0 fives
	1 ones
	1 quarters
	0 dimes
	0 nickels
	4 pennies
Adding money1 and money2 calling second add method:
	$10.59 + $20.70 = $31.29
USER INPUT:
First money
dollars = 256
cents = 128
Second money
dollars = 64
cents = 32
Fewest number of bills and coins (money 1) 
	2 hundreds
	1 fifties
	0 twenties
	0 tens
	1 fives
	2 ones
	1 quarters
	0 dimes
	0 nickels
	3 pennies
Adding money1 and money2 calling first add method:
	$257.28 + $64.32 = $321.60
Fewest number of bills and coins (money 3) 
	3 hundreds
	0 fifties
	1 twenties
	0 tens
	0 fives
	1 ones
	2 quarters
	1 dimes
	0 nickels
	0 pennies
Adding money1 and money2 calling second add method:
	$257.28 + $64.32 = $321.60
*/