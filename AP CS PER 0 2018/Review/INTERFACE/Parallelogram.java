package INTERFACE;

public class Parallelogram implements Shape, Comparable<Object> {
	
	private double b;
	private double h;
	
	public Parallelogram() {
		this.b = 1;
		this.h = 1;
	}
	
	public Parallelogram(double b, double h) {
		this.b = b;
		this.h = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return b * h;
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
		return "Parallelogram with base = " + b + " and height = " + h;
	}

}
