package org.wecancodeit;

public class Shelter {

	private static int litterBox;

	public static void useLitterBox() {
		litterBox++;

	}

	public void scoopLitterBox() {
		litterBox = 0;
	}

	public String getLitterBoxStatus() {
		String litterBoxStatus = null;
		if (litterBox < 3) {
			litterBoxStatus = "The litter box is fresh.";
		} else if (litterBox > 2 && litterBox < 6) {
			litterBoxStatus = "The litter box is starting to stink.";
		} else {
			litterBoxStatus = "The litter box reeks.";
		}
		return litterBoxStatus;
	}

	private static int cages;

	public static void dogPooAccident() {
		cages = cages + 3;
	}

	public void cleanDogCages() {
		cages = 0;
	}

	public String getCageStatus() {
		String cageStatus = null;
		if (cages < 4) {
			cageStatus = "The cages are clean.";
		} else if (cages < 7) {
			cageStatus = "The cages could use some cleaning.";
		} else {
			cageStatus = "The cages are a Doggy-Do-do-Minefield!";
		}
		return cageStatus;
	}

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

