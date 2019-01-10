package ARRAYS;

public class TEST {
	private String puzzle;
	
	public TEST(String s) {
		puzzle = s;
	}
	
	public String getHint(String guess) {
		guess = guess.toUpperCase();
		char[] hint = new char[guess.length()];
		
		for(int i = 0; i < hint.length; i++) {
			if(guess.charAt(i) == puzzle.charAt(i)) {
				hint[i] = guess.charAt(i);
			} else if(puzzle.indexOf(guess.charAt(i)) != -1 && puzzle.indexOf(guess.charAt(i)) != i) {
				hint[i] = '+';
			} else {
				hint[i] = '*';
			}
		}
		
		
		return new String(hint);
	}
}
