package ABSTRACT.pet;

public abstract class Pet {
	private String name;
	
	
	public Pet(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract String speak();
}


/*
 1. Abstract classes may have defined constructors, and methods, whereas interfaces can only hold constants and abstract methods.
 2. An abstract class is any class with a combination of abstract and concrete methods.
 3. Subclasses are classes that extend a Superclass
 4. PIVs are still private and can only be accessed within the class or through accessor methods.
 5. An abstract method is a method without body/implementation. speak is abstract since it has different implementation across each of its subclasses
 6. Inheritance is the subclasses ability to utilize the methods, constructors, and PIVs of its super class
 7. Is-a defines the relationship between subclass and superclass
 		Cat is-a Pet
 	Has-a defines the relationship between a class and its PIVs
 		Kennel has-a Pet
 8. Polymorphism is the nature of objects to be different during runtime and compile time.
*/
