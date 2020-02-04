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

		// Game Loop
		String userChoice;
		int exit = 1;
		do {
			mainMenu();
			userChoice = input.nextLine();
			if (userChoice.contentEquals("1")) {
				shelter.getRosterWithKeys();
				menu1();
				userChoice = input.nextLine();
				if (userChoice.toLowerCase().contentEquals("yes")) {
					userChoice = "0";
					menu1submenu1();
					userChoice = input.nextLine();
					if (userChoice.toLowerCase().contentEquals("all")) {
						shelter.getAllPetStats();
						addLine();
					} else {
						int userkey = Integer.parseInt(userChoice);
						shelter.getPetStats(userkey);
						addLine();
					}
				}
				userChoice = "0";
			}
			if (userChoice.contentEquals("2")) {
				menu2();
				userChoice = input.nextLine();
				if (userChoice.toLowerCase().contentEquals("one")) {
					menu2submenu1();
					addLine();
					shelter.getDogRosterWithKeys();
					int userkey = Integer.parseInt(userChoice);
					shelter.walkADog(userkey);
					addLine();
				}
				if (userChoice.toLowerCase().contentEquals("all")) {
					shelter.walkAllOrganicDogs();
				}
				userChoice = "0";
			}
			if (userChoice.contentEquals("3")) {
				menu3();
				userChoice = input.nextLine();
				if (userChoice.toLowerCase().contains("feed")) {
					menu3submenu1();
					//feeding
				}
				if (userChoice.toLowerCase().contains("water")) {
					menu3submenu2();
					//watering
				}
				userChoice = "0";
			}
			if (userChoice.contentEquals("4")) {
				//robotic pets
				userChoice = "0";
			}
			if (userChoice.contentEquals("5")) {
				//adoption and admittance
				userChoice = "0";
			}

			if (userChoice.contentEquals("6")) {
				exit = 2;
			}
			userChoice = "0";
			shelter.tickAllPets();
		} while (exit == 1);

		// Scanner close
		input.close();

	} // class methods are in opposite order of occurrence.

	private static void menu3submenu2() {
		// TODO Auto-generated method stub
		
	}

	private static void menu3submenu1() {
		// TODO Auto-generated method stub
		
	}

	private static void menu3() {
		System.out.println("");
		System.out.println("Would you like to \"Feed\" or \"Water\"?");
	}

	private static void menu2submenu1() {
		System.out.println("");
		System.out.println("Who would you like to walk?");
		System.out.println("Input the number assosicate with the Dog.");
	}

	private static void menu2() {
		System.out.println("");
		System.out.println("Would you like to walk \"one\" dog, or \"all\" the dogs?");
	}

	private static void menu1submenu1() {
		System.out.println("");
		System.out.println("You may input the number corisponding to the pet from");
		System.out.println("the list above, or type all to see all pets status.");
	}

	private static void menu1() {
		System.out.println("");
		System.out.println("Would you like to know more about the pets?");
		System.out.println("Say yes or no");
	}

	private static void mainMenu() {
		System.out.println("");
		System.out.println("Enter the number coorisponding to your choice.");
		System.out.println("\t1:View Pet(s)");
		System.out.println("\t2:Walk Dog(s)");
		System.out.println("\t3:Feeding and Watering Pet(s)");
		System.out.println("\t4:Robotic Pet(s)");
		System.out.println("\t5:Adoption and Admittance");
		System.out.println("\t6:Leave the Shelter");
	}

	private static void welcomeStatement() {
		System.out.println("");
		System.out.println("Welcome to Caleb's pet shelter.");
		System.out.println("Get ready, because these pets are A.M.O.K.");
		System.out.println("A Madness Of some Kind");
	}

	private static void addLine() {
		System.out.println("");
	}

}
