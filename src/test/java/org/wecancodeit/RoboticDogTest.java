package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoboticDogTest {

	RoboticDog underTest = new RoboticDog(null, null, 10, 10, null);
	
	@Test
	public void roboticDogLubeTicksFast() {
		int lBefore = underTest.getLubeLevel();
		int eBefore = underTest.getEnergyLevel();
		underTest.tick();
		int lAfter = underTest.getLubeLevel();
		int eAfter = underTest.getEnergyLevel();
		assertEquals(lBefore-2, lAfter);
		assertEquals(eBefore-1, eAfter);
	}
	
	@Test
	public void roboticDogHealthShouldDecreaseOverTime() {
		double result1 = underTest.getHealth();
		assertEquals(100, result1, .1);
		underTest.tick();
		double result2 = underTest.getHealth();
		assertEquals(80, result2, .1);
	}

}
