package ARRAYS;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(int length, int width) {
		this.length = Math.abs(length);
		this.width = Math.abs(width);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double findArea() {
		return length*width;
	}
	
	public double findPerimeter() {
		return 2*length + 2*width;
	}
	
	public boolean equals(Rectangle rec) {
		return this.getLength() == rec.getLength() && this.getWidth() == rec.getWidth();
	}
	
	@Override
	public String toString() {
		return length + " by " + width ;
	}
}
