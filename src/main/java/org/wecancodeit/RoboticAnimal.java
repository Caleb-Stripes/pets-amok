package org.wecancodeit;

public class RoboticAnimal extends Animal {
// RoboticAnimal, OrganicAnimal and Animal are abstract rather than concrete classes
	//this is because they don't create objects, but rather tell their child classes how to create classes
	
	
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
		this.energyLevel = 10;
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
	
	
}
