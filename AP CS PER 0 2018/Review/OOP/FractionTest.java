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
		input.close();
	}
}


/*
fraction1 
Numerator = 1
Denominator = 0

fraction2 
Numerator = 0
Denominator = 1

fraction1 = undefined
fraction2 = 0/1
undefined + 0/1 = undefined
undefined * 0/1 = undefined
undefined - 0/1 = undefined
undefined / 0/1 = undefined

*/

/*
fraction1 
Numerator = -3
Denominator = 4

fraction2 
Numerator = 3
Denominator = -4

fraction1 = -3/4
fraction2 = -3/4
-3/4 + -3/4 = -3/2
-3/4 * -3/4 = 9/16
-3/4 - -3/4 = 0/1
-3/4 / -3/4 = 1/1


*/

/*
fraction1 
Numerator = -5
Denominator = 11

fraction2 
Numerator = -6
Denominator = -5

fraction1 = -5/11
fraction2 = 6/5
-5/11 + 6/5 = 41/55
-5/11 * 6/5 = -6/11
-5/11 - 6/5 = -91/55
-5/11 / 6/5 = -25/66

*/