package org.wecancodeit;

public class LitterBox {

	/* This class will tell the program what a litter box is and will also be used
	 * for the code of dog cages. 
	 */
	
	private int pooLevel;
	private String boxStatus;
	private String name;
	
	public LitterBox(int pooLevel, String name) {
		this.pooLevel = pooLevel;
		this.name = name;
	}

	public String getLitterBoxStatus() {
		if (pooLevel < 3) {
			boxStatus = "The " + name + " is fresh.";
		}
		else if (pooLevel < 6) {
			boxStatus = "The " + name + " is starting to stink.";
		}
		else if (pooLevel > 5) {
			boxStatus = "The " + name + " reeks.";
		}
		return boxStatus;
	}

	public void addPoo(int i) {
		pooLevel = pooLevel + i;
	}

	public void cleanLitterBox() {
		pooLevel = 0;
	}

}
