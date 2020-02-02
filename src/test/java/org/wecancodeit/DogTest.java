package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	Dog underTest = new Dog(null, null, 0, 0, 0, 4);


	@Test
	public void catShouldPooBowelsShouldBe0() {
		int result1 = underTest.getPoo();
		underTest.organicTick();
		underTest.tick();
		int result2 = underTest.getPoo();
		underTest.organicTick();
		underTest.tick();
		int result3 = underTest.getPoo();
		underTest.organicTick();
		underTest.tick();
		int result4 = underTest.getPoo();
		assertEquals(result1, 4);
		assertEquals(result2, 5);
		assertEquals(result3, 6);
		assertEquals(result4, 0);
	}
	
}
