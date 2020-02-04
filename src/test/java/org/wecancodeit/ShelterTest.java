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
	
	@Test
	public void hueyShouldPoopInTheBox() {
		String result = underTest.getLitterBoxStatus();
		assertEquals("The litter box is fresh.", result);
		underTest.catPoosInBox(3);
		String result2 = underTest.getLitterBoxStatus();
		assertEquals("The litter box is starting to stink.", result2);
		underTest.catPoosInBox(3);
		String result3 = underTest.getLitterBoxStatus();
		assertEquals("The litter box reeks.", result3);
		underTest.cleanCatLitterBox();
		String result4 = underTest.getLitterBoxStatus();
		assertEquals("The litter box is fresh.", result4);
	}
	
	@Test
	public void ottoShouldPoopInTheCage() {
		String result = underTest.getDogCageStatus();
		assertEquals("The dog cages is fresh.", result);
		underTest.dogPoosInCage(3);
		String result2 = underTest.getDogCageStatus();
		assertEquals("The dog cages is starting to stink.", result2);
		underTest.dogPoosInCage(3);
		String result3 = underTest.getDogCageStatus();
		assertEquals("The dog cages reeks.", result3);
		underTest.cleanDogCages();
		String result4 = underTest.getDogCageStatus();
		assertEquals("The dog cages is fresh.", result4);
	}
	
}
