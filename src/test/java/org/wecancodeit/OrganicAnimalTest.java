package org.wecancodeit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicAnimalTest {

	OrganicAnimal underTest = new OrganicAnimal(null, null, 0, 0, 0, 0);

	@Test
	public void hungerShouldBe0() {
		int result = underTest.getHunger();
		assertEquals(result, 0);

	}

	@Test
	public void thirstShouldBe0() {
		int result = underTest.getThirst();
		assertEquals(result, 0);
	}

	@Test
	public void boredomShouldBe0() {
		int result = underTest.getBoredom();
		assertEquals(result, 0);
	}

	@Test
	public void organicTickShouldIncreasAllBy1() {
		int hBefore = underTest.getHunger();
		int tBefore = underTest.getThirst();
		int bBefore = underTest.getBoredom();
		int pBefore = underTest.getPoo();
		underTest.organicTick();
		int hAfter = underTest.getHunger();
		int tAfter = underTest.getThirst();
		int bAfter = underTest.getBoredom();
		int pAfter = underTest.getPoo();
		assertEquals(hBefore + 1, hAfter);
		assertEquals(tBefore + 1, tAfter);
		assertEquals(bBefore + 1, bAfter);
		assertEquals(pBefore + 1, pAfter);
	}
}
