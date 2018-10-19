package OOP;

import java.util.Scanner;

public class MoneyLab {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Money money1, money2, money3, money4;
		int dollars, cents;

		money1 = new Money(10, 59);
		money2 = new Money(20, 70);

		System.out.print("Fewest number of bills and coins ");
		System.out.println("(money 1) ");

		money1.getAndPrintDetails();
		money3 = money1.add(money2.getDollars(), money2.getCents());

		System.out.print("Adding money1 and money2 calling");
		System.out.println(" first add method:");
		System.out.print("\t" + money1 + " + " + money2);
		System.out.println(" = " + money3);
		System.out.print("Fewest number of bills and coins");
		System.out.println(" (money 3) ");

		money3.getAndPrintDetails();

		System.out.print("Adding money1 and money2 calling");
		System.out.println(" second add method:");

		money4 = money1.add(money2);

		System.out.print("\t" + money1 + " + " + money2);
		System.out.println(" = " + money4);

		System.out.println("USER INPUT:");


		System.out.println("First money");
		System.out.print("dollars = ");

		dollars = input.nextInt();
		System.out.print("cents = ");

		cents = input.nextInt();
		money1 = new Money(dollars, cents);

		System.out.println("Second money");
		System.out.print("dollars = ");

		dollars = input.nextInt();

		System.out.print("cents = ");
		cents = input.nextInt();
		money2 = new Money(dollars, cents);

		System.out.print("Fewest number of bills and coins");
		System.out.println(" (money 1) ");

		money1.getAndPrintDetails();
		money3 = money1.add(money2.getDollars(), money2.getCents());

		System.out.print("Adding money1 and money2 calling");
		System.out.println(" first add method:");
		System.out.print("\t" + money1 + " + " + money2);
		System.out.println(" = " + money3);
		System.out.print("Fewest number of bills and coins");
		System.out.println(" (money 3) ");

		money3.getAndPrintDetails();

		System.out.print("Adding money1 and money2 calling");
		System.out.println(" second add method:");

		money4 = money1.add(money2);

		System.out.print("\t" + money1 + " + " + money2);
		System.out.println(" = " + money4);
		input.close();
	}
}
