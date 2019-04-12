package ABSTRACT.pet;

public class PetClient {
	public static void main(String[] args) {
		// construct a Cat with name "Tiger" which has the Cat reference cat1
		Cat cat1 = new Cat("Tiger");
		// construct a Cat with name "Jinx" which has the Pet reference pet1
		Pet pet1 = new Cat("Jinx");
		// construct a Cat with name "Sweetie" which has a Cat reference cat2
		Cat cat2 = new Cat("Sweetie");
		// construct a Cat with name "Honey" which has a Pet reference pet2
		Pet pet2 = new Cat("Honey");
		// construct a Dog with name "Spot" which has a Dog reference dog1
		Dog dog1 = new Dog("Spot");
		// construct a Dog with name "Benji" which has a Pet reference pet3
		Pet pet3 = new Dog("Benji");
		// construct a Dog with name "Spike" which has a Dog reference dog2
		Dog dog2 = new Dog("Spike");
		// construct a Dog with name "Brutus" which has a Pet reference pet4
		Pet pet4 = new Dog("Brutus");
		// construct a LoudDog with name "Lassie" which has a LoudDog
		// reference loudDog1
		LoudDog loudDog1 = new LoudDog("Lassie");
		// construct a LoudDog with name "Kujo" which has a Pet reference pet5
		Pet pet5 = new LoudDog("Kujo");
		// construct a LoudDog with name "Tiny" which has a Pet reference pet6
		Pet pet6 = new LoudDog("Tiny");
		// construct a Kennel
		Kennel k = new Kennel();
		// add all the Pets to the Kennel
		k.addPet(cat1);
		k.addPet(pet1);
		k.addPet(cat2);
		k.addPet(pet2);
		k.addPet(dog1);
		k.addPet(pet3);
		k.addPet(dog2);
		k.addPet(pet4);
		k.addPet(loudDog1);
		k.addPet(pet5);
		k.addPet(pet6);
		// print the Kennel
		k.printPets();
		
		// make all the Pets speak
		k.allSpeak();
		// remove pets named "Kujo", "Bella", and "Spot" from the Kennel
		Pet p1 = new Dog("Kujo");
		Pet p2 = new Dog("Bella");
		Pet p3 = new Dog("Spot");
		k.removePet(p1);
		k.removePet(p2);
		k.removePet(p3);
		// print the Kennel
		
		k.printPets();
		// make all the Pets speak
		k.allSpeak();
	}
}
