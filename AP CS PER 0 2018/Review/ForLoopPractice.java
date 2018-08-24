import java.util.Scanner;
public class ForLoopPractice {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double userInput;
		
		int count = 0;
		int tries = 0;
		while(count < 3) {
			System.out.print("Enter 3 even numbers:");
			userInput = (int) input.nextDouble();
			if(userInput % 2 == 0) {
				count++;
			}
			tries++;
		}
		System.out.print("It took you " + tries + " tries to enter 3 even numbers");
	}

}
