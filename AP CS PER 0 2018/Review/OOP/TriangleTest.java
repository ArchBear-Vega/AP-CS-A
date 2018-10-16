package OOP;

public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle tri1 = new Triangle();
		
		Triangle tri2 = new Triangle();
		
		System.out.println(tri1 + ";" + tri2);
		
		System.out.println(tri1.classify() + ";" + tri2.classify());
		
		System.out.println(tri1.getPerimeter() + ";" + tri2.getPerimeter());

		System.out.println(tri1.equals(tri2));
	}
}
