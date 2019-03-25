package INTERFACE;

public class Circle implements Shape, Comparable<Object> {

	private double r;
	
	
	public Circle() {
		this.r = 1;
	}
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Shape) o).getArea()) {
			return 1;
		} else if (getArea() < ((Shape) o).getArea()) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Circle with radius = " + r;
	}

}
