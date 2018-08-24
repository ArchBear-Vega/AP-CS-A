import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String userInput;
		
		String inputUnit;
		String inputValue;
		double outputValue;
		String outputUnit;	
	
		
		System.out.print("From: ");
		userInput = input.nextLine();
		
		System.out.print("To: ");
		outputUnit = input.nextLine();
		
		inputValue = userInput.substring(0 , userInput.indexOf(" "));
		outputValue = Double.parseDouble(inputValue);
		inputUnit = userInput.substring(userInput.indexOf(" "));
		
		if(inputUnit.equals(" mm")) {
			outputValue /= 1000;
			System.out.print(outputValue);
		} else if (inputUnit.equals(" cm")) {
			outputValue /= 100;
		} else if (inputUnit.equals(" km")) {
			outputValue *= 1000;
		} else if (inputUnit.equals(" ft")) {
			outputValue *= 0.3048;
		} else if (inputUnit.equals(" in")) {
			outputValue *= 0.0254;
		}
		
		if(outputUnit.equals("mm")) {
			outputValue *= 1000;
		} else if (outputUnit.equals("cm")) {
			outputValue *= 100;
		} else if (outputUnit.equals("km")) {
			outputValue /= 1000;
		} else if (outputUnit.equals("m")) {
			
		} else if (outputUnit.equals("ft")) {
			outputValue *= 3.2808399;
		} else if (outputUnit.equals("in")) {
			outputValue *= 39.3701;
		}
		
	
		
	
		System.out.print(inputValue + inputUnit + " is " + outputValue + outputUnit);
	}

}
