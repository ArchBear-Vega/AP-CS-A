import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] whatevers) {
		Scanner input = new Scanner(System.in);

		int num1 = 0;

		System.out.print("Enter an integer:");
		num1 = input.nextInt();
		input.close();
		while (num1 % 2 == 0) {
			System.out.print("2");
			num1 /= 2;
		}
		
		for (int count = 3; count <= Math.sqrt(num1); count += 2) {
				while(num1%count == 0) {
					System.out.print(count);
					num1 /= count;
					
				}
		}
	}
}
