package org.wecancodeit;

import org.wecancodeit.Shelter;

public class Cat extends OrganicAnimal implements OrganicAnimalThings {

	private static final String type = "Cat";

	public Cat(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	public String getType() {
		return type;
	}

	public void catTick() {
		if (super.getPoo() > 5) {
			poo();
			Shelter.useLitterBox();
		}
		drink();
		eat();
		play();

	}

	@Override
	public void eat() {
		if (super.getHunger() > 5) {
			super.eatSome();
		}

	}

	@Override
	public void drink() {
		if (super.getThirst() > 5) {
			super.drinkSome();
		}

	}

	@Override
	public void play() {
		if (super.getBoredom() > 5) {
			super.playSome();
		}
	}

	@Override
	public void poo() {
		super.goPoo();
	}

}
