package ARRAYS;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double findArea() {
		return length*width;
	}
	
	public double findPerimeter() {
		return 2*length + 2*width;
	}
	@Override
	public String toString() {
		return length + " cm x " + width + " cm";
	}
}
