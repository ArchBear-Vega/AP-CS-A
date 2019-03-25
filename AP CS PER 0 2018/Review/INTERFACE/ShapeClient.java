package INTERFACE;

import java.util.Scanner;

public class ShapeClient {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a base: ");
		double base1 = input.nextDouble();
		System.out.print("Enter a height: ");
		double height1 = input.nextDouble();

		Parallelogram para1 = new Parallelogram(base1, height1);
		System.out.println(para1);

		System.out.print("\nEnter a radius: ");
		double radius1 = input.nextDouble();

		Circle cir1 = new Circle(radius1);
		System.out.println(cir1);

		System.out.print("\nEnter a base: ");
		double base2 = input.nextDouble();
		System.out.print("Enter a height: ");
		double height2 = input.nextDouble();

		Triangle tri1 = new Triangle(base2, height2);
		System.out.println(tri1);

		System.out.print("\nEnter a base: ");
		double base3 = input.nextDouble();
		System.out.print("Enter a height: ");
		double height3 = input.nextDouble();

		Shape shape1 = new Parallelogram(base3, height3);
		System.out.println(shape1);

		System.out.print("\nEnter a radius: ");
		double radius2 = input.nextDouble();

		Shape shape2 = new Circle(radius2);
		System.out.println(shape2);

		System.out.print("\nEnter a base: ");
		double base4 = input.nextDouble();
		System.out.print("Enter a height: ");
		double height4 = input.nextDouble();

		Shape shape3 = new Triangle(base4, height4);
		System.out.println(shape3);

		Shape[] shapeList = { para1, cir1, tri1, shape1, shape2, shape3 };

		System.out.println("\n\tShape Areas");

		for (Shape e : shapeList) {
			System.out.println(e.getClass().getSimpleName() + " has area of " + e.getArea());
		}

		System.out.println();
		Shape largest = null;

		for (int i = 0; i < shapeList.length - 1; i++) {
			Shape e = shapeList[i];
			Shape e2 = shapeList[i + 1];

			switch (((Comparable<Object>) e).compareTo(e2)) {
			case -1:
				largest = e2;
				break;
			case 0:
				largest = e2;
				break;
			case 1:
				largest = e;
				break;
			}
		}

		System.out.println(largest + " is the largest Shape.");

		input.close();
	}
}
