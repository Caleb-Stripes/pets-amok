package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	/*
	 * This code defines the shelter as a map that takes animal objects it is
	 * designed to be instantiated in the application class where it will be filled
	 * with pets and iterated over with method functions to emulate the operations
	 * and interactions within a pet shelter upon entry into the shelter each animal
	 * will be assigned a unique key to allow access to them as an object in the map
	 * no keys will ever be duplicated (there is possible issue that could arise
	 * when iterating over the map using keys, if a key was created for an animal,
	 * then that animal gets adopted, will the iterator be able to jump the key
	 * gap?)
	 */
	private int petKey;
	private int totalKeys;

	private Map<Integer, Animal> shelter = new HashMap<>();

	public Collection<Animal> getAllPets() {
		return shelter.values();
	}

	public int getPetKey() {
		totalKeys++;
		petKey = (totalKeys);
		return petKey;
	}

	public void addNewPetToShelter(Animal pet) {
		shelter.put(getPetKey(), pet);
	}

	public int getPopulation() {

		return shelter.size();
	}

	public void tickAllPets() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			String type = (entry.getValue().getClass().getTypeName().substring(16));
			System.out.println(type);
			System.out.println(
					(entry.getValue().getName()) + " the " + entry.getValue().getClass().getTypeName().substring(16));
			if (type.contentEquals("Cat")) {
				System.out.println("Meow");
			}
			if (type.contentEquals("Dog")) {
				System.out.println("Arf");
			}
			if (type.contentEquals("RoboticDog")) {
				System.out.println("b o w w o w");
			}
			if (type.contentEquals("RoboticCat")) {
				System.out.println("m e o w");
			}
		}
	}

	/*
	 * This code block dictates the cats waste control the use of static integers
	 * and methods could cause issues if multiple shelter objects are instantiated
	 */
	private LitterBox litterBox = new LitterBox(0);

	public void useLitterBox() {
		litterBox.addPoo(1);
	}

	public void cleanLitterBox() {
		litterBox.cleanLitterBox();
	}

	public void litterBoxStatus() {
		litterBox.getLitterBoxStatus();
	}

	// This code block dictates the dogs waste control
	private LitterBox dogCages = new LitterBox(0);

	public void soilCages() {
		dogCages.addPoo(3);
	}

	public void cleanCages() {
		dogCages.cleanLitterBox();
	}

	public void getCageStatus() {
		String cageStatus = null;
		if (dogCages.getPooLevel() < 3) {
			cageStatus = "The cages are clean.";
		} else if (dogCages.getPooLevel() <= 6) {
			cageStatus = "The cages could use some cleaning.";
		} else {
			cageStatus = "The cages are a Doggy-Do-do-Minefield!";
		}
		System.out.println(cageStatus);
	}

	// This code block allows organic animals to consume food if it available to
	// all.
	public static double foodDishes;

	public double getFoodDish() {
		return foodDishes;
	}

	public void fillFoodDishes() {
		foodDishes = 5.00;
	}

	public static void animalEats(double amount) {
		foodDishes = foodDishes - amount;
	}

}
