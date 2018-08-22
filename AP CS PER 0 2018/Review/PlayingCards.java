import java.util.Scanner;

public class PlayingCards {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String valueText = "";
		String suitText = "";
		String userInput;
		String value;
		char suit;

		System.out.print("Enter the card notation:");
		userInput = input.next();

		suit = userInput.charAt(userInput.length() - 1);
		value = userInput.substring(0, userInput.length() - 1);

		if (suit == 'D') {

			suitText = "Diamonds";

		} else if (suit == 'S') {

			suitText = "Spades";

		} else if (suit == 'C') {

			suitText = "Clubs";

		} else if (suit == 'H') {

			suitText = "Hearts";

		} else {

			System.out.println("Error: Suit Notation is invalid, will not print");
		}

		if (value.equals("A")) {

			valueText = "Ace";

		} else if (value.equals("K")) {

			valueText = "King";

		} else if (value.equals("Q")) {

			valueText = "Queen";

		} else if (value.equals("J")) {

			valueText = "Jack";

		} else if (value.equals("10")) {

			valueText = "Ten";

		} else if (value.equals("9")) {

			valueText = "Nine";

		} else if (value.equals("8")) {

			valueText = "Eight";

		} else if (value.equals("7")) {

			valueText = "Seven";

		} else if (value.equals("6")) {

			valueText = "Six";

		} else if (value.equals("5")) {

			valueText = "Five";

		} else if (value.equals("4")) {

			valueText = "Four";

		} else if (value.equals("3")) {

			valueText = "Three";

		} else if (value.equals("2")) {

			valueText = "Two";

		} else {
			System.out.println("Error: Value is invalid, will not Print");
		}

		System.out.print(valueText + " of " + suitText);
	}

}
