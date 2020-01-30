package org.wecancodeit;
import org.wecancodeit.Shelter;

public class Dog extends OrganicAnimal implements OrganicAnimalThings{

	private static final String type = "Dog";
	
	public Dog(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	public String getType() {
		return type;
	}

	public void dogTick() {
		if (super.getPoo() >= 7) {
			poo();
			Shelter.dogPooAccident();
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
		// An if statement that checked for other dogs with desires to play here could be interesting.
		
	}
	
}
