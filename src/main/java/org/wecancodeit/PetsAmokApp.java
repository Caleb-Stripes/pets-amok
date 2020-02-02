package org.wecancodeit;

public class PetsAmokApp {

	public static void main(String[] args) {

		Shelter shelter = new Shelter();
		Animal huey = new Cat("Huey", null, 0, 0, 0, 4);
		Animal otto = new Dog("Otto", null, 0, 0, 0, 0);
		Animal sparky = new RoboticDog("Sparky", null, 0, 0, null);
		
		shelter.addNewPetToShelter(huey);
		shelter.addNewPetToShelter(otto);
		shelter.addNewPetToShelter(sparky);
		shelter.getPopulation();
		shelter.tickAllPets();
		shelter.getLitterBoxStatus();
		shelter.getDogCageStatus();
		System.out.println("");
		System.out.println("");
		shelter.tickAllPets();
		
		shelter.getRosterWithKeys();
		
	}

//	public void newAnimal() {
//		String name;
//		String description;
//		String classType;
//		Animal name = new classType(name, description, 0, 0, 0, 0);
//	}
	
}
