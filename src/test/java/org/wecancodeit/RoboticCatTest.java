package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoboticCatTest {

	RoboticCat underTest = new RoboticCat(null, null, null, 10, 10, null);
	
	@Test
	public void roboticDogLubeTicksFast() {
		int lBefore = underTest.getLubeLevel();
		int eBefore = underTest.getEnergyLevel();
		underTest.robotAnimalTick();
		underTest.robotCatTick();
		int lAfter = underTest.getLubeLevel();
		int eAfter = underTest.getEnergyLevel();
		assertEquals(eBefore-3, eAfter);
		assertEquals(lBefore-1, lAfter);
	}

}
