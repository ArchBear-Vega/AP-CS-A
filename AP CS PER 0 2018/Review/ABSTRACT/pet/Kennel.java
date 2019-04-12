package ABSTRACT.pet;

public class Kennel {
	private Pet[] petList;
	private int numPets;

	public Kennel() {
		petList = new Pet[10];
		numPets = 0;
	}

	public void addPet(Pet pet) {
		if (numPets < 10) {
			numPets++;
			for (int i = numPets - 1; i > 0; i--) {
				petList[i] = petList[i - 1];
			}
			petList[0] = pet;
		}
	}

	public void removePet(Pet pet) {
		if (numPets > 0) {

			int index = findPet(pet);

			if (index != -1) {
				for (int j = index; j < 9; j++) {
					if (j >= numPets) {
						petList[j] = null;
					}
					petList[j] = petList[j + 1];

				}
				petList[numPets - 1] = null;
				numPets--;
			}
		}
	}

	private int findPet(Pet pet) {
		for (int i = 0; i < 10; i++) {
			if (petList[i] != null && petList[i].getName().equals(pet.getName())) {
				return i;
			}
		}
		return -1;
	}

	public void printPets() {
		String e = "";
		for (Pet p : petList) {
			if (p != null) {
				e += p.getName() + " ";
			}
		}
		System.out.println("Pets in the kennel: " + e);
		System.out.println();
	}

	public void allSpeak() {
		for (Pet p : petList) {
			if (p != null) {
				System.out.println(p.getName() + " says " + p.speak());

			}
		}
		System.out.println();
	}

}
