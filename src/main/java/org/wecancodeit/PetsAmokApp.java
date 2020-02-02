package org.wecancodeit;

import java.util.Scanner;

public class PetsAmokApp {

	public static void main(String[] args) {

		welcomeStatement();
		Scanner input = new Scanner(System.in);
		
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
		
		System.out.println("\nAdd your pet.");
		System.out.println("What kind of pet is it?");
		System.out.println("Cat, Dog, Roboitc Cat or Robotic Dog.");
		shelter.getNewType(input.nextLine());
		System.out.println(shelter.newType);
		System.out.println("\nWhat is its name?");
		shelter.getNewName(input.nextLine());
		System.out.println(shelter.newPetName);
		System.out.println("\nDescribe it.");
		shelter.getNewDescription(input.nextLine());
		System.out.println(shelter.newDescription);
		shelter.addNewPetToShelter(shelter.addNewCustomPet());
		
		System.out.println("");
		shelter.tickAllPets();
		
		
		
		shelter.getRosterWithKeys();
		input.close();
	}

	private static void welcomeStatement() {
		System.out.println("Welcome to Caleb's pet shelter.");
		System.out.println("Get ready, because these pets are A.M.O.K.");
		System.out.println("A Madness Of some Kind");
		
	}


}
