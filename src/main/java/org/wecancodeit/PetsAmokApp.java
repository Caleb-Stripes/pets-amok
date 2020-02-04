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
			shelterHealthMessage();
			System.out.println("Average Pet Health:" + shelter.getOverAllShelterHealth() + "%");
			System.out.println("There is " + shelter.getFoodDish() + " oz. of food availible to pets.");
			System.out.println("There is " + shelter.getWaterDish() + " oz. of water availile to pets.");
			System.out.println(shelter.getLitterBoxStatus());
			System.out.println(shelter.getDogCageStatus());
			mainMenu();
			userChoice = input.nextLine();
			if (userChoice.contentEquals("1")) {
				shelter.getRosterWithKeysAndHealth();
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
					userChoice = input.nextLine();
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
					userChoice = input.nextLine();
					if (userChoice.toLowerCase().contentEquals("all")) {
						shelter.fillFoodDishes();
						System.out.println("There is " + shelter.getFoodDish() + " oz. of food availible to pets.");
					}
					if (userChoice.toLowerCase().contains("one")) {
						shelter.getOrganicRosterWithKeys();
						System.out.println("Choose a pet to feed by their number.");
						userChoice = input.nextLine();
						int userKey = Integer.parseInt(userChoice);
						shelter.feedAPet(userKey);
					}
					userChoice = "0";
				}
				if (userChoice.toLowerCase().contains("water")) {
					menu3submenu2();
					userChoice = input.nextLine();
					if (userChoice.toLowerCase().contains("all")) {
						shelter.fillWaterDishes();
						System.out.println("There is " + shelter.getWaterDish() + " oz. of water availible to pets.");
					}
					if (userChoice.toLowerCase().contains("one")) {
						shelter.getOrganicRosterWithKeys();
						System.out.println("Choose a pet to water by their number.");
						userChoice = input.nextLine();
						int userKey = Integer.parseInt(userChoice);
						shelter.waterAPet(userKey);
					}
					userChoice = "0";
				}
				userChoice = "0";
				addLine();
			}
			if (userChoice.contentEquals("4")) {
				shelter.getRoboticRosterWithKeys();
				menu4();
				userChoice = input.nextLine();
				if (userChoice.toLowerCase().contains("oil")) {
					menu4submenu1();
					userChoice = input.nextLine();
					if (userChoice.toLowerCase().contains("one")) {
						System.out.println("Choose a pet to oil by their number.");
						userChoice = input.nextLine();
						int userKey = Integer.parseInt(userChoice);
						shelter.oilAPet(userKey);
					}
					if (userChoice.toLowerCase().contains("all")) {
						shelter.oilAllRobots();
					}
					userChoice = "0";
				}
				if (userChoice.toLowerCase().contains("charge")) {
					menu4submenu2();
					userChoice = input.nextLine();
					if (userChoice.toLowerCase().contains("one")) {
						System.out.println("Choose a pet to charge by their number.");
						userChoice = input.nextLine();
						int userKey = Integer.parseInt(userChoice);
						shelter.chargeAPet(userKey);
					}
					if (userChoice.toLowerCase().contains("all")) {
						shelter.chargeAllRobots();
					}
				}
				userChoice = "0";
			}
			if (userChoice.contentEquals("5")) {
				menu5();
				userChoice = input.nextLine();
				if (userChoice.toLowerCase().contentEquals("adopting")) {
					shelter.getRosterWithKeysAndHealth();
					addLine();
					System.out.println("Who would you like to adopt?");
					System.out.println("Enter the coorisponding number.");
					userChoice = input.nextLine();
					int userKey = Integer.parseInt(userChoice);
					shelter.adoptPet(userKey);
					userChoice = "0";
				}
				if (userChoice.contains("admitting")) {
					//admitting
				}
				userChoice = "0";
			}

			if (userChoice.contentEquals("6")) {

				// shelter cleaning
				userChoice = "0";
			}
			if (userChoice.contentEquals("7")) {
				exit = 2;
			}
			userChoice = "0";
			shelter.tickAllPets();
		} while (exit == 1);

		// Scanner close
		input.close();

	} // class methods are in opposite order of occurrence.

	private static void menu5() {
		System.out.println("");
		System.out.println("Are you \"Adopting\" or \"Admitting\"?");

	}

	private static void menu4submenu2() {
		System.out.println("");
		System.out.println("Would you like to charge \"One\" or \"All\" robotic pets?");
	}

	private static void menu4submenu1() {
		System.out.println("");
		System.out.println("Would you like to oil \"One\" or \"All\" robotic pets?");
	}

	private static void menu4() {
		System.out.println("");
		System.out.println("What would you like to do with Robotic Pets?");
		System.out.println("\"Oil\" or \"Charge\"");

	}

	private static void menu3submenu2() {
		System.out.println("");
		System.out.println("Would you like to water \"One\" or \"All\" pet(s)?");
	}

	private static void menu3submenu1() {
		System.out.println("");
		System.out.println("Would you like to feed \"One\" or \"All\" pet(s)?");

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
		System.out.println("\t6:Shelter Cleaning");
		System.out.println("\t7:Leave the Shelter");
	}

	private static void welcomeStatement() {
		System.out.println("");
		System.out.println("Welcome to Caleb's pet shelter.");
		System.out.println("Get ready, because these pets are A.M.O.K.");
		System.out.println("\"A Madness Of some Kind\"");
	}

	private static void shelterHealthMessage() {
		System.out.println("");
		System.out.println("\t\t -Shelter Health-");

	}

	private static void addLine() {
		System.out.println("");
	}

}
