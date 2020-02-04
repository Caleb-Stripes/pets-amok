package org.wecancodeit;

public class Cat extends OrganicAnimal implements OrganicAnimalThings {

	public Cat(String name, String description, int hunger, int thirst, int boredom, int bowels) {
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
		if (super.getPoo() > 5) {
			poo();
			System.out.println("I pooed");
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
	public void eat() {
		if (Shelter.foodDishes > 1) {
			Shelter.animalEats(0.25);
			super.eatSome();
		}

	}

	@Override
	public void drink() {
		if (Shelter.waterDishes > 0.5) {
			Shelter.animalDrinks(0.25);
			super.drinkSome();
		}

	}

	@Override
	public void play() {
		if (super.getBoredom() > 5) {
			super.playSome();
			System.out.println(super.getName() + " is playing with a stuffed mouse.");
		}
	}

	@Override
	public void poo() {
		super.goPoo();
	}

	@Override
	public int flexAction() {
		return super.getPoo();
	}

	@Override
	public double getHealth() {
		double health = ((10 - ((getHunger() + getThirst() + getBoredom() + getPoo()) / 4)) * 10);

		return health;

	}
}
