package org.wecancodeit;

public class OrganicAnimal extends Animal {

	private int hunger;
	private int thirst;
	private int boredom;
	private int bowels;

	public OrganicAnimal(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description);
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.bowels = bowels;

	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}
	
	public int getPoo() {
		return bowels;
	}

	public void organicTick() {
		hunger++;
		thirst++;
		boredom++;
		bowels++;
		
	}

}
