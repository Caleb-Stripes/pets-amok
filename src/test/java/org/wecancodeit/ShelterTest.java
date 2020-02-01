package org.wecancodeit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ShelterTest {

	Shelter underTest = new Shelter();
	Animal huey = new Cat("Huey", null, 0, 0, 0, 0);
	Animal otto = new Dog("Otto", null, 0, 0, 0, 0);
	Animal sparky = new RoboticDog("Sparky", null, 0, 0, null);
	
	@Test
	public void shouldAddPetToShelter() {
		int result0 = underTest.getPopulation();
		assertEquals(0, result0);
		underTest.addNewPetToShelter(huey);
		int result1 = underTest.getPopulation();
		assertEquals(1, result1);
		underTest.addNewPetToShelter(otto);
		underTest.addNewPetToShelter(sparky);
		int result3 = underTest.getPopulation();
		assertEquals(3, result3);
	}
	
	
}
