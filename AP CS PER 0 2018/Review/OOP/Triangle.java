package OOP;

public class Triangle {


	public double sideA;
	public double sideB;
	public double sideC;

	public Triangle() {

		this.sideA = 1;
		this.sideB = 1;
		this.sideC = 1;
	}

	public Triangle(double sideA, double sideB, double sideC) {

		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public void multiply(double factor) {

		this.sideA *= factor;
		this.sideB *= factor;
		this.sideC *= factor;
	}

	public double getPerimeter() {

		return sideA + sideB + sideC;
	}

	public String toString() {
		
		return sideA + "," + sideB + "," + sideC;
	}

	@Override
	public boolean equals(Object anObject) {
		Triangle i = (Triangle) anObject;

		return (i.sideA == this.sideA && i.sideB == sideB && i.sideC == sideC);

	}


	public String classify() {
		if(sideA == sideB || sideB == sideC) {
			if(sideA == sideC) {
				return "Equilateral";
			}
			return "Isoceles";
		}
		return "Scalene";
	}
}
