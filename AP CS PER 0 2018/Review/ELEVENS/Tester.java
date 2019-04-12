package ELEVENS;

public class Tester {
	public static void main(String[] args) {
		
		
		
		// Initialize Deck 
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		
		
		// Output deck
		System.out.println(d);
		
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		
		System.out.println(d);
		
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		
		
		System.out.println(d);
		
	}
}
