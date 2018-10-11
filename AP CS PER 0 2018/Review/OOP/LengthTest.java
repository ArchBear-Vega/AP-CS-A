package OOP;

import java.util.Scanner;

public class LengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Length l = new Length();
		Scanner in = new Scanner(System.in);

		System.out.println("There are:");
		System.out.println(l);

		System.out.print("How many inches? ");
		int inches = in.nextInt();

		l.addInches(inches);

		System.out.println(inches + "in =");
		System.out.println(l);

		System.out.print("How many yards? ");

		int yards = in.nextInt();

		System.out.print("How many feet? ");

		int feet = in.nextInt();

		System.out.print("How many inches? ");

		int inches2 = in.nextInt();
		
		Length l2 = new Length(yards, feet, inches2);
		
		System.out.println("There are:");
		System.out.println(l2.toString());
		
		System.out.println("Add 26 inches");
		l2.addInches(26);
		
		System.out.println("Now there are:");
		System.out.print(l2.toString());
		
		
		in.close();
	}

}
/*
There are:
	0yds
	0ft
	0in

How many inches? 75
75in =
	2yds
	0ft
	3in

How many yards? 5
How many feet? 10
How many inches? 15
There are:
	5yds
	10ft
	15in

Add 26 inches
Now there are:
	9yds
	1ft
	5in
*/

/*
There are:
	0yds
	0ft
	0in

How many inches? -72
-72in =
	0yds
	0ft
	-72in

How many yards? -5
How many feet? 5
How many inches? 5
There are:
	5yds
	5ft
	5in

Add 26 inches
Now there are:
	7yds
	1ft
	7in
*/

/*
There are:
	0yds
	0ft
	0in

How many inches? 999999999
999999999in =
	27777777yds
	2ft
	3in

How many yards? 0
How many feet? 36
How many inches? 256
There are:
	0yds
	36ft
	256in

Add 26 inches
Now there are:
	19yds
	2ft
	6in
*/