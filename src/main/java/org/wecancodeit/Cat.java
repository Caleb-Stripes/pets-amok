package org.wecancodeit;



public class Cat extends OrganicAnimal implements OrganicAnimalThings {

	public Cat(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	public void catTick() {
		if (super.getPoo() > 5) {
			poo();
			
		}
		drink();
		eat();
		play();

	}  //--move this function into the tick for all pets in the shelter class

	@Override
	public void eat() {
		if (Shelter.foodDishes > 1) {
			Shelter.animalEats(0.25);
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
