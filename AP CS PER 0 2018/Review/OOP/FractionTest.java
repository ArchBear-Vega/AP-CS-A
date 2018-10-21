package OOP;

import java.util.Scanner;

public class FractionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numer1, denom1, numer2, denom2;
		System.out.println("fraction1 ");
		System.out.print("Numerator = ");
		numer1 = input.nextInt();
		System.out.print("Denominator = ");
		denom1 = input.nextInt();
		System.out.println(); 
		Fraction fraction1 = new Fraction(numer1, denom1);// construct fraction1 using numer1 and denom1 // WRITE THIS
		System.out.println("fraction2 ");
		System.out.print("Numerator = ");
		numer2 = input.nextInt();
		System.out.print("Denominator = ");
		denom2 = input.nextInt();
		System.out.println();
		// construct fraction2 using numer2 and denom2 // WRITE THIS
		Fraction fraction2 = new Fraction(numer2, denom2);
		System.out.println("fraction1 = " + fraction1);
		
		System.out.println("fraction2 = " + fraction2);

		Fraction fraction3 = fraction1.add(fraction2);
		System.out.println(fraction1 + " + " + fraction2 + " = " + fraction3);
		Fraction fraction4 = fraction1.multiply(fraction2);
		System.out.println(fraction1 + " * " + fraction2 + " = " + fraction4); 
		Fraction fraction5 = fraction1.subtract(fraction2);
		System.out.println(fraction1 + " - " + fraction2 + " = " + fraction5); 
		Fraction fraction6 = fraction1.divide(fraction2);
		System.out.println(fraction1 + " / " + fraction2 + " = " + fraction6);
	}
}
