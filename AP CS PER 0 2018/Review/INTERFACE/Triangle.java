package INTERFACE;

public class Triangle implements Shape, Comparable<Object> {

	private double b;
	private double h;

	public Triangle() {
		this.b = Math.sqrt(2);
		this.h = Math.sqrt(2);
	}
	public Triangle(double b, double h) {
		this.b = b;
		this.h = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (b * h) / 2;
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
	
	public String toString() {
		return "Triangle with base = " + b + " and height = " + h;
	}

}
