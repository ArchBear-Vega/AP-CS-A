import java.util.Scanner;

public class FibonnaciGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1 = 1;
		int num2 = 0;
		int count;
		int num3 = 1;

		System.out.print("How many numbers of the Fibbonacci Sequence do you want to print?:");
		count = input.nextInt();

		for (int count1 = 1; count1 <= count; count1++) {

			num1 = num2;
			num2 = num3;
			System.out.println(num2);
			num3 = num1 + num2;

		}
	}

}
