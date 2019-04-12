package ABSTRACT.pet;

public class LoudDog extends Dog {

	public LoudDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		return super.speak() + super.speak();
		
	}

}
