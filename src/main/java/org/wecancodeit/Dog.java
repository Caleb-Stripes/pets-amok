package org.wecancodeit;

public class Dog extends OrganicAnimal implements OrganicAnimalThings {

	public Dog(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	@Override
	public void getStatus() {
		System.out.println("Hunger:" + getHunger());
		System.out.println("Thirst:" + getThirst());
		System.out.println("Boredom:" + getBoredom());
		System.out.println("Bowels:" + super.getPoo());
	}

	@Override
	public void tick() {
		super.organicTick();
		if (super.getPoo() >= 7) {
			poo();
		}
		if (super.getHunger() > 5) {
			eat();
		}
		if (super.getThirst() > 5) {
			drink();
		}
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
		if (Shelter.waterDishes > 0.5) {
			Shelter.animalDrinks(0.5);
			super.drinkSome();
		}
	}

	@Override
	public void play() {
		if (super.getBoredom() > 5) {
			super.playSome();
			System.out.println(super.getName() + " is playing with a rubber chicken.");
		}

	}

	// a prepared integer return method for unforeseen use
	@Override
	public int flexAction() {
		super.playSome();
		super.goPoo();
		return 0;
	}

	@Override
	public double getHealth() {
		double health = ((10 - ((getHunger() + getThirst() + getBoredom() + getPoo()) / 4)) * 10);

		return health;

	}

}
