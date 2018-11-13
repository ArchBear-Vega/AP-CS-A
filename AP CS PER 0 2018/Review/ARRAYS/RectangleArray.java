package ARRAYS;

import java.util.Scanner;

public class RectangleArray {
	
	private Rectangle[] list;
	
	public RectangleArray() {
		list = new Rectangle[20];
	}
	
	public void fillArray(Rectangle rectangle) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 20; i++) {
			
			list[i-1] = rectangle;
		}
		
		input.close();
	}
	
	public void print() {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
		}
	}
	
	public int search(Rectangle item) {
		for(Rectangle rec : list) {
			if(rec.equals(item)) {
				
			}
		}
	}
	
	public double largestArea() {
		
	}
	
	public double smallestArea() {
		
	}
	
	public double largestPerimeter() {
		
	}
	
	public double smallestPerimeter() {
		
	}
}
