package org.wecancodeit;

public abstract class RoboticAnimal extends Animal {
// RoboticAnimal, OrganicAnimal and Animal are abstract rather than concrete classes
	// this is because they don't create objects, but rather tell their child
	// classes how to create classes

	private int lubeLevel;
	private int energyLevel;
	private String status;

	public RoboticAnimal(String name, String description, int lubeLevel, int energyLevel, String status) {
		super(name, description);
		this.lubeLevel = lubeLevel;
		this.energyLevel = energyLevel;
		this.status = status;
	}

	public int getLubeLevel() {
		return lubeLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void robotAnimalTick() {
		lubeLevel--;
		energyLevel--;
	}

	public void lubeUp() {
		this.lubeLevel = 10;
		this.status = "Lubed Up";
	}

	public void chargeUp() {
		energyLevel = 10;
	}

	public void drainLube() {
		lubeLevel--;
	}

	public void drainEnergy() {
		energyLevel--;
	}

	public String seizeUp() {
		lubeLevel++;
		energyLevel++;
		status = "Siezed Up";
		return status;
	}

	public String deadCharge() {
		lubeLevel++;
		energyLevel++;
		status = "Dead Charge";
		return status;
	}

	public String roboticPetHealth() {
		String roboticStatus = (lube() + " and " + charge());
		return roboticStatus;
	}

	private String charge() {
		String chargeMessage;
		if (getEnergyLevel() > 4) {
			chargeMessage = "Has a good charge";
		} else if (getEnergyLevel() > 0) {
			chargeMessage = "Will need to charge soon";
		} else {
			chargeMessage = deadCharge();
		}

		return chargeMessage;
	}

	private String lube() {
		String lubeMessage;
		if (getLubeLevel() > 4) {
			lubeMessage = "Has good mobility";
		} else if (getLubeLevel() > 0) {
			lubeMessage = "Will need lube soon";
		} else {
			lubeMessage = seizeUp();
		}
		return lubeMessage;
	}
}
