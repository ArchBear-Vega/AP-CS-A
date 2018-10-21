package OOP;

public class Fraction {
	private int numerator;
	private int denominator;
	private boolean negative;

	public Fraction() {
		
	}
	
	public Fraction(int numerator, int denominator) {
		
		
		
		this(Math.abs(numerator), Math.abs(denominator), (numerator < 0 && denominator < 0) || (numerator > 0 && denominator > 0) ? false : true);
		
	}
	
	private Fraction(int numerator, int denominator, boolean negative) {

		this.numerator = numerator;
		this.denominator = denominator;
		this.negative = negative;
		reduce();
		
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public boolean isNegative() {
		return negative;
	}

	public String toString() {
		return isNegative() ? "-" + numerator + "/" + denominator : "" + numerator + "/" + denominator;
	}

	public Fraction add(Fraction fr2) {
		int newNum = 0, newDen = 0;
		int tempNum1 = numerator, tempNum2 = fr2.getNumerator();
		boolean sign = false;
		
		
	
		if(denominator != fr2.getDenominator()) {
			tempNum1 *= fr2.getDenominator();
			tempNum2 *= denominator;
			newDen = fr2.getDenominator() * denominator;
		} else {
			newDen = denominator;
		}
		
		System.out.println(tempNum1 + "TEST NUM");
		System.out.println(tempNum2 + "TEST NUM");
		// SAME SIDES ADD AND KEEP, DIFFERENT SIGNS SUBTRACT, KEEP THE SIGN OF THE GREATER NUMBER THEN YOU'LL BE EXACT!
		if(isNegative() && fr2.isNegative()) {
			
			newNum = tempNum1 + tempNum2;
			sign = true;
		} else if ((!isNegative() && fr2.isNegative()) || (isNegative() && !fr2.isNegative())) {
			
			newNum = Math.max(tempNum1, tempNum2) - Math.min(tempNum1, tempNum2);
			sign = Math.max(tempNum1, tempNum2) < 0;
		} else if (!isNegative() && !fr2.isNegative()) {
			
			newNum = tempNum1 + tempNum2;
			sign = false;
		}
		
		
		
		
		return new Fraction(newNum, newDen, sign);
	}
	
	private void reduce() {
		if(getNumerator() == getDenominator()) {
			numerator = 1;
			denominator = 1;
		} else {
			int gcm = getGCM (numerator, denominator);
			numerator /= gcm;
			denominator /= gcm;
			System.out.println(gcm);
			
		}
	}
	

	private int getGCM(int a, int b) {
		return b == 0 ? a : getGCM(b, a % b);
	}
	
	public Fraction multiply(Fraction fr2) {
		boolean sign = true;
		if(isNegative() && fr2.isNegative() || !isNegative() && !fr2.isNegative()) {
			sign = false;
		} else {
			sign = true;
		}
		return new Fraction(numerator * fr2.getNumerator(), denominator * fr2.getDenominator(), sign);
		
	}
	
	public Fraction divide(Fraction fr2) {
		
		return multiply(new Fraction(fr2.getDenominator(), fr2.getNumerator(), fr2.isNegative()));
	}
	
	public Fraction subtract(Fraction fr2) {
		
		return add(new Fraction(fr2.getNumerator(), fr2.getDenominator(), !fr2.isNegative()));
	}
}
