package org.wecancodeit;

public class RoboticCat extends RoboticAnimal {

	public RoboticCat(String name, String description, int lubeLevel, int energyLevel, String status) {
		super(name, description, lubeLevel, energyLevel, status);
	}

	public void tick() {
		robotAnimalTick();
		if (super.getEnergyLevel() < 5) {
			super.deadCharge();
		} else {
			super.drainEnergy();
			super.drainEnergy();
		}
	}

	// a prepared integer return method for unforeseen use
	@Override
	public int flexAction() {
		return 0;
	}

	@Override
	public void getStatus() {
		System.out.println("Energy:" + super.getEnergyLevel());
		System.out.println("Oil Level:" + super.getLubeLevel());
	}

	@Override
	public double getHealth() {
		double health = (((getLubeLevel() + getEnergyLevel()) / 2) * 10);
		return health;
	}

}
