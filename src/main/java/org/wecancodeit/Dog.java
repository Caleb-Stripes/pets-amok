package org.wecancodeit;

public class Dog extends OrganicAnimal {

	private static final String type = "Dog";

	public Dog(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	public String getType() {
		return type;
	}

	public void dogTick() {
		if (Dog.super.getPoo() >= 7) {
			soilsCage();
		}
	}

	private String soilsCage() {
		// once shelter is created the cage should become soiled when this method is called
		// return for initial test only
		return "Cage is soiled";
	}
	
}
