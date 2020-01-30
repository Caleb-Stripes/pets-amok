package org.wecancodeit;

public class RoboticCat extends RoboticAnimal {

	public RoboticCat(String name, String description, int lubeLevel, int energyLevel, String status) {
		super(name, description, lubeLevel, energyLevel, status);
	}

	public void robotCatTick() {
		if (super.getEnergyLevel() < 5) {
			super.deadCharge();
		} else {
			super.drainEnergy();
			super.drainEnergy();
		}
	}

}
