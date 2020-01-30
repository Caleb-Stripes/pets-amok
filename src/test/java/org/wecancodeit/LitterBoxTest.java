package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class LitterBoxTest {
	LitterBox underTest = new LitterBox(0);
	
	@Test
	public void litterBoxShouldBeFresh() {
		String result = underTest.getLitterBoxStatus();
		assertEquals(result, "The litter box is fresh.");
	}
	
	@Test
	public void litterBoxShouldStartToStink() {
		underTest.addPoo(3);
		String result = underTest.getLitterBoxStatus();
		assertEquals(result, "The litter box is starting to stink.");
		underTest.addPoo(3);
		String result2 = underTest.getLitterBoxStatus();
		assertEquals(result2, "The litter box reeks.");
		underTest.cleanLitterBox();
		String result3 = underTest.getLitterBoxStatus();
		assertEquals(result3, "The litter box is fresh.");
	}
	
	@Test
	public void catShouldAddPooToLitterBox() {
		Cat cat = new Cat(null, null, 0, 0, 0, 6);
		cat.catTick();
		String result = underTest.getLitterBoxStatus();
		assertEquals(result, "The litter box is starting to stink.");
	}

}
