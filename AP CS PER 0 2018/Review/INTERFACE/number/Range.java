package INTERFACE.number;

public class Range implements NumberGroup {

	private int b;
	private int u;

	public Range(int b, int u) {
		this.b = b;
		this.u = u;
	}

	@Override
	public boolean contains(int num) {

		return num >= b && num <= u;
	}

}
