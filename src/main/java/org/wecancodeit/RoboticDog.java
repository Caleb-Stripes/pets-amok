package org.wecancodeit;

public class RoboticDog extends RoboticAnimal {

	public RoboticDog(String name, String description, int lubeLevel, int energyLevel, String status) {
		super(name, description, lubeLevel, energyLevel, description);
	}

	public void tick() {
		robotAnimalTick();
		if (super.getLubeLevel() < 3) {
			super.seizeUp();
		} else {
			super.drainLube();
		}
	}

	// a prepared integer return method for unforeseen use
	@Override
	public int flexAction() {
		super.drainLube();
		super.drainLube();
		super.drainLube();
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
