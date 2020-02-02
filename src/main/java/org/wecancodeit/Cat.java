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
		drink();
		System.out.println("I drank");
		eat();
		System.out.println("I ate");
		play();
		System.out.println("I played");

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

	@Override
	public int flexAction() {
		return super.getPoo();
	}
}
