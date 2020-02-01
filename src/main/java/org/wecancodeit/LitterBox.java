package org.wecancodeit;

public class LitterBox {

	private int pooLevel;
	
	public LitterBox(int pooLevel) {
		this.pooLevel = pooLevel;
	}
	
	public int getPooLevel() {
		return pooLevel;
	}
	
	public String getLitterBoxStatus() {
		String litterBoxStatus = null;
		if (pooLevel < 3) {
			litterBoxStatus = "The litter box is fresh.";
		} else if (pooLevel > 2 && pooLevel < 6) {
			litterBoxStatus = "The litter box is starting to stink.";
		} else {
			litterBoxStatus = "The litter box reeks.";
		}
		System.out.println(litterBoxStatus);
		return litterBoxStatus;
	}

	public void addPoo(int poo) {
		pooLevel = pooLevel + poo;		
	}

	public void cleanLitterBox() {
		pooLevel = 0;
		
	}
	
	
	
}
