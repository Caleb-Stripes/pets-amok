package org.wecancodeit;

public class Cat extends OrganicAnimal {

	

	private static final String type = "Cat";

	public Cat(String name, String description, int hunger, int thirst, int boredom, int bowels) {
		super(name, description, hunger, thirst, boredom, bowels);
	}

	public String getType() {
		return type;
	}
	
	
	public void catTick() {
		if (Cat.super.getPoo() > 5) {
			useLitterBox();
		}
		
		
	}

	private void useLitterBox() {
		//currently does nothing but once shelter has litter box then this should FILL IT!
		
	}

}
