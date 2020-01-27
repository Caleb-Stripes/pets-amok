package org.wecancodeit;

public class RoboticDog extends RoboticAnimal {

	public RoboticDog(String name, String description, int lubeLevel, int energyLevel, String status) {
		super(name, description, lubeLevel, energyLevel, description);
	}

	public void robotDogTick() {
		if (super.getLubeLevel() < 3) {
			super.seizeUp();
		} else {
		super.drainLube();
		}
	}
	
	

}
