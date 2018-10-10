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
		this.setYards(Math.abs(yards));
		this.setFeet(Math.abs(feet));
		this.setInches(Math.abs(inches));
	}

	public void addInches(int inches) {
		this.inches += inches;
		simplify();
	}

	public Length simplify() {
		while (inches >= 12 || feet >= 3) {
			this.feet += this.inches / 12;
			this.inches %= 12;
			this.yards += this.feet / 3;
			this.feet %= 3;
		}
		return new Length(this.yards, this.feet, this.inches);
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
		this.yards = yards;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
}
