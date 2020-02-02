package org.wecancodeit;

public abstract class Animal {

	private String name;
	private String description;

	public Animal(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void tick() {

	}

	public void getStatus() {

	}

	public int flexAction() {
		return 0;

	}

}
