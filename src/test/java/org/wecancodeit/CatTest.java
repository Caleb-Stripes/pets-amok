package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatTest {

	Cat underTest = new Cat(null, null, 0, 0, 0, 3);
	
	@Test
	public void typeShouldBeCat() {
		String result = underTest.getType();
		assertEquals(result, "Cat");
	}
	
	@Test
	public void catShouldPooBowelsShouldBe0() {
		int result1 = underTest.getPoo();
		underTest.organicTick();
		underTest.catTick();
		int result2 = underTest.getPoo();
		underTest.organicTick();
		underTest.catTick();
		int result3 = underTest.getPoo();
		underTest.organicTick();
		underTest.catTick();
		int result4 = underTest.getPoo();
		assertEquals(result1, 3);
		assertEquals(result2, 4);
		assertEquals(result3, 5);
		assertEquals(result4, 0);
	}
	//@Test
	//public void shouldAddToLitterBox()

}
