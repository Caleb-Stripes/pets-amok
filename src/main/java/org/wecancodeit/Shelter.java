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
	private LitterBox catLitterBox = new LitterBox(0, "litter box");
	private LitterBox dogCages = new LitterBox(0, "dog cages");

	public Collection<Animal> getAllPets() {
		return shelter.values();
	}

	public int getPopulation() {
		return shelter.size();
	}

	// gets a successive value for newly created pets to assign as a map key

	public int getPetKey() {
		totalKeys++;
		petKey = (totalKeys);
		return petKey;
	}

	// adds a Animal to the shelter map

	public void addNewPetToShelter(Animal pet) {
		shelter.put(getPetKey(), pet);
	}

	/*
	 * A method to return each loop used to convey the overall health of the pets
	 * and shelter
	 */

	private double overAllHealth;

	public double getOverAllShelterHealth() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			double currentEntryHealth = entry.getValue().getHealth();
			overAllHealth = overAllHealth + currentEntryHealth;
		}
		overAllHealth = (overAllHealth / shelter.size());
		return overAllHealth;
	}

	/*
	 * This method will return strings of key and value pairs from the shelter map
	 * it should be used in the application whenever a roster is needed.
	 */

	private String keyPetPair;

	public String getRosterWithKeysAndHealth() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			keyPetPair = (entry.getKey() + "\t" + entry.getValue().getName());
			System.out.println(keyPetPair + " @" + entry.getValue().getHealth() + "% Health");
		}
		return keyPetPair;
	}

	public void getDogRosterWithKeys() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			keyPetPair = (entry.getKey() + "\t" + entry.getValue().getName());
			if (entry instanceof Dog) {
				System.out.println(keyPetPair);
			}
		}

	}

	public void getOrganicRosterWithKeys() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			keyPetPair = (entry.getKey() + "\t" + entry.getValue().getName());
			if (entry instanceof OrganicAnimal) {
				System.out.println(keyPetPair);
			}
		}
	}

	/*
	 * This code allows for the admittance of new custom pets, it starts with a menu
	 * option asking what kind of animal is being submitted. Then based on the user
	 * input will enter a switch/case statement executing the appropriate type
	 * specific instantiation method.
	 */

	protected String newPetName;
	protected String newDescription;
	protected String newType;

	public Animal addNewCustomPet() {
		switch (newType) {
		case ("Cat"):
			Animal newCat = new Cat(newPetName, newDescription, 0, 0, 0, 0);
			return newCat;
		case ("Dog"):
			Animal newDog = new Dog(newPetName, newDescription, 0, 0, 0, 0);
			return newDog;
		case ("Robotic Cat"):
			Animal newRoboCat = new RoboticCat(newPetName, newDescription, 0, 0, null);
			return newRoboCat;
		case ("Robotic Dog"):
			Animal newRoboDog = new RoboticDog(newPetName, newDescription, 0, 0, null);
			return newRoboDog;
		default:
			return null;
		}
	}

	public String getNewName(String newName) {
		this.newPetName = newName;
		return newPetName;
	}

	public String getNewDescription(String newDescription) {
		this.newDescription = newDescription;
		return newDescription;
	}

	public String getNewType(String newType) {
		this.newType = newType;
		return newType;
	}

	/*
	 * Here are methods to walk a dog or all the dogs
	 */

	public void walkADog(int key) {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry.getKey() == key && (entry instanceof Dog || entry instanceof RoboticDog)) {
				entry.getValue().flexAction();
				System.out.println("You and " + entry.getValue().getName() + " have a nice walk.");
			} else if (entry.getKey() == key) {
				System.out.println(entry.getValue().getName() + " isn't interested in walks.");
			} else {
				System.out.println("That key does not match any pets.");
			}
		}
	}

	public void walkAllOrganicDogs() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry instanceof Dog) {
				((Dog) entry).goPoo();
				((Dog) entry).play();
			}
		}
		System.out.println("The dogs love you!");
	}

	/*
	 * Here is the feeding and watering method for single Organic pets
	 */

	public void feedAPet(int key) {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry.getKey() == key && (entry instanceof OrganicAnimal)) {
				((OrganicAnimal) entry).eatSome();
				System.out.println("You feed " + entry.getValue().getName());
			} else if (entry.getKey() == key) {
				System.out.println(entry.getValue().getName() + " isn't interested in food.");
			} else {
				System.out.println("That key does not match any organic pets.");
			}
		}
	}

	public void waterAPet(int key) {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry.getKey() == key && (entry instanceof OrganicAnimal)) {
				((OrganicAnimal) entry).drinkSome();
				System.out.println("You water " + entry.getValue().getName());
			} else if (entry.getKey() == key) {
				System.out.println(entry.getValue().getName() + " isn't interested in drinking.");
			} else {
				System.out.println("That key does not match any organic pets.");
			}
		}
	}
	/*
	 * Here is a method to oil all robotic pets
	 */

	public void oilAllRobots() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry instanceof RoboticAnimal) {
				((RoboticAnimal) entry).lubeUp();
			}
		}
	}

	/*
	 * And one to charge all robotic pets
	 */

	public void chargeAllRobots() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry instanceof RoboticAnimal) {
				((RoboticAnimal) entry).chargeUp();
			}
		}
	}
	/*
	 * This code should tick all the pets in the shelter so that the passage of time
	 * is emulated.
	 */

	public void tickAllPets() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			// organic split off
			if (entry instanceof OrganicAnimal) {
				if (entry instanceof Cat) {
				}
				if (((Cat) entry).getPoo() > 0) {
					catLitterBox.addPoo(1);
				}

				((Animal) entry).tick();

				if (entry instanceof Dog) {
					if (((Dog) entry).getPoo() > 0) {
						dogCages.addPoo(3);
					}
					((Dog) entry).tick();
				}
			}
			// robotic split off
			if (entry instanceof RoboticAnimal) {
				if (entry instanceof RoboticCat) {
					((RoboticCat) entry).tick();
				}
				if (entry instanceof RoboticDog) {
					((RoboticDog) entry).tick();
				}
			}

		}
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

	public static double waterDishes;

	public double getWaterDish() {
		return waterDishes;
	}

	public void fillWaterDishes() {
		waterDishes = 5.00;
	}

	public static void animalDrinks(double amount) {
		waterDishes = waterDishes - amount;
	}
	/*
	 * This code will control how the cats interact with the litter box and also
	 * allow the user to clean the litter box as needed. It will have a method to
	 * give the user an idea of state of the litter box as time passes. A message
	 * conveying this information should be coded into the tick method.
	 */

	public String getLitterBoxStatus() {
		String boxStatus = catLitterBox.getLitterBoxStatus();
		return boxStatus;
	}

	public void catPoosInBox(int amount) {
		catLitterBox.addPoo(amount);

	}

	public void cleanCatLitterBox() {
		catLitterBox.cleanLitterBox();

	}

	/*
	 * Now the same code slightly adjusted for the dog cages. Polymorphism allows
	 * DnD characters to assume animal like forms and/or use animal like abilities;
	 * in this situation it allows a litterBox object to also represent a dog cage.
	 */

	public String getDogCageStatus() {
		String cageStatus = dogCages.getLitterBoxStatus();
		return cageStatus;

	}

	public void dogPoosInCage(int amount) {
		dogCages.addPoo(amount);

	}

	public void cleanDogCages() {
		dogCages.cleanLitterBox();
	}

	// Code for communicating the status of a pet

	public void getPetStats(int key) {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			if (entry.getKey() == key) {
				System.out.println(entry.getValue().getName());
				entry.getValue().getStatus();
			}
		}
	}

	public void getAllPetStats() {
		for (Map.Entry<Integer, Animal> entry : shelter.entrySet()) {
			entry.getValue().getName();
			entry.getValue().getStatus();
		}
	}

}
