package OOP;

public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle tri1 = new Triangle();
		
		Triangle tri2 = new Triangle(6, 4, 4);
		
		System.out.println(tri1 + ";" + tri2);
		
		System.out.println(tri1.classify() + ";" + tri2.classify());
		
		System.out.println(tri1.getPerimeter() + ";" + tri2.getPerimeter());
		
		tri1.multiply(2);
		
		tri2.multiply(.5);
		
		System.out.println(tri1.getPerimeter() + ";" + tri2.getPerimeter());
	}
}
