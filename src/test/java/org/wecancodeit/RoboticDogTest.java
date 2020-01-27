package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoboticDogTest {

	RoboticDog underTest = new RoboticDog(null, null, 10, 10, null);
	
	@Test
	public void roboticDogLubeTicksFast() {
		int lBefore = underTest.getLubeLevel();
		int eBefore = underTest.getEnergyLevel();
		underTest.robotAnimalTick();
		underTest.robotDogTick();
		int lAfter = underTest.getLubeLevel();
		int eAfter = underTest.getEnergyLevel();
		assertEquals(lBefore-2, lAfter);
		assertEquals(eBefore-1, eAfter);
	}

}
