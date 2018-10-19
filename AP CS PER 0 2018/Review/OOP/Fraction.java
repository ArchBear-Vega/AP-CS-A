package OOP;

public class Fraction {
	private int numerator;
	private int denominator;
	private boolean negative;

	public Fraction() {
		
	}
	
	public Fraction(int numerator, int denominator) {
		
		boolean negative = (numerator < 0 && denominator < 0) || (numerator > 0 && denominator > 0) ? false : true;
		
		new Fraction(Math.abs(numerator), Math.abs(denominator), negative);
	}
	
	private Fraction(int numerator, int denominator, boolean negative) {

		this.numerator = numerator;
		this.denominator = denominator;
		this.negative = negative;
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


	public Fraction add(Fraction fr2) {
		int newNum, newDen;

		newNum = (fr2.isNegative()) ? this.numerator * fr2.getDenominator() + fr2.getNumerator() * this.denominator : this.numerator * fr2.getDenominator() - fr2.getNumerator() * this.denominator;
		newDen = this.denominator * fr2.getDenominator();
		
		return new Fraction(newNum, newDen);
	}
}
