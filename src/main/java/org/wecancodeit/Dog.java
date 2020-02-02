package org.wecancodeit;

public class Dog extends OrganicAnimal implements OrganicAnimalThings {

	public Dog(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	public void dogTick() {
		if (super.getPoo() >= 7) {
			poo();
		}
		eat();
		drink();
		play();
	} 

	@Override
	public void poo() {
		super.goPoo();
	}

	@Override
	public void eat() {
		if (Shelter.foodDishes > 1) {
			Shelter.animalEats(0.50);
			super.eatSome();
		}

	}

	@Override
	public void drink() {
		if (super.getThirst() > 3) {
			super.drinkSome();
		}
	}

	@Override
	public void play() {
		// An if statement that checked for other dogs with desires to play here could
		// be interesting.

	}
	
	// a prepared integer return method for unforeseen use
	@Override
	public int flexAction() {
		return 0;
	}

}
