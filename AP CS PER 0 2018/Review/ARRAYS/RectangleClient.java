package ARRAYS;

import java.util.Scanner;

public class RectangleClient {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		RectangleArray r = new RectangleArray();
		
		int maxL = 0;
		int maxW = 0;
		
		System.out.print("Max length = ");
		maxL = in.nextInt();
		System.out.print("Max width = ");
		maxW = in.nextInt();
		
		r.fillArray(maxL, maxW);
		
		
		r.print();
		
		System.out.print("Search for Rectangle");
		System.out.print("Length");
		int l = in.nextInt();
		System.out.print("Width");
		int w = in.nextInt();
		
		System.out.println("The Rectangle with length " + l + " and width " + w + " occurs at index " + r.search(new Rectangle(l, w)));
		
		System.out.println("The Rectangle with the largest area is " + r.largestArea());
		System.out.println("The Rectangle with the smallest area is " + r.smallestArea());
		System.out.println("The Rectangle with the largest perimeter is " + r.largestPerimeter());
		System.out.println("The Rectangle with the smallest perimeter is " + r.smallestPerimeter());

		in.close();
	}
}
