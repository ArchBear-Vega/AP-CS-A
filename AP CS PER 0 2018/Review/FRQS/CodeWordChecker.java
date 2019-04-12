package FRQS;

public class CodeWordChecker implements StringChecker {

	private int min;
	private int max; 
	private String forbidden;
	
	
	public CodeWordChecker(int min, int max, String word) {
		this.min = min;
		this.max = max;
		this.forbidden = word;
	}
	
	public CodeWordChecker(String word) {
		this.min = 6;
		this.max = 20;
		this.forbidden = word;
	}
	
	
	@Override
	public boolean isValid(String s) {
		if(s.length() <= max && s.length() >= min && s.indexOf(forbidden) == -1) {
			return true;
		}
		return false;
	}

}
