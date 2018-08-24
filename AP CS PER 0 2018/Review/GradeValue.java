
import java.util.Scanner;

public class GradeValue{

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double gradeText = 0;
		String userInput;
		char value;
		String grade;

		System.out.print("Enter the Grade:");
		userInput = input.next();
		if(userInput.length() > 1) {
			grade = userInput.substring(0, userInput.length() - 1);
		
			value = userInput.charAt(userInput.length() - 1);
		} else {
			grade = userInput;
			value = 0;
		}

		if (grade.equals("A")) {
			
			gradeText = 4.0;
			if(value == '+') {
				System.out.print(gradeText);
				return;
			}

		} else if (grade.equals("B")) {

			gradeText = 3.0;

		} else if (grade.equals("C")) {

			gradeText = 2.0;

		} else if (grade.equals("D")) {

			gradeText = 1.0;

		} else if (grade.equals("F")) {

			gradeText = 0;
			System.out.print("Numeric value: 0.0");
			return;

		} else {

			System.out.println("Error: Grade is invalid, will not print");
			return;
		}
		
		if(value == '-') {
			gradeText -= .3;
		} else if (value == '+') {
			gradeText += .3;
		} else {
			System.out.println("Error: Modifier invalid or does not exist");
		}
		
		System.out.print("Numeric value: " + gradeText);

		
		
	}

}
