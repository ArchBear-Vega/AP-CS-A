package OOP;

public class Length {
	private int yards;
	private int feet;
	private int inches;

	public Length() {
		this.setYards(0);
		this.setFeet(0);
		this.setInches(0);
	}

	public Length(int yards, int feet, int inches) {
		this.setYards(yards);
		this.setFeet(feet);
		this.setInches(inches);
		simplify();
	}

	public void addInches(int inches) {
		this.inches += Math.abs(inches);
		simplify();
	}

	private void simplify() {
		if (inches >= 12 || feet >= 3) {
			this.feet += this.inches / 12;
			this.inches %= 12;
			this.yards += this.feet / 3;
			this.feet %= 3;
		}
	}

	public void printLength() {
		System.out.print(toString());
	}

	public String toString() {
		return "\t" + yards + "yds" + "\n\t" + feet + "ft" + "\n\t" + inches + "in\n";
	}

	public int getYards() {
		return yards;
	}

	public void setYards(int yards) {
		this.yards = Math.abs(yards);
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = Math.abs(feet);
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = Math.abs(inches);
	}
}
