package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	Dog underTest = new Dog(null, null, 0, 0, 0, 4);


	@Test
	public void dogShouldPooBowelsShouldBe0() {
		int result1 = underTest.getPoo();
		//underTest.organicTick();
		underTest.tick();
		int result2 = underTest.getPoo();
		//underTest.organicTick();
		underTest.tick();
		int result3 = underTest.getPoo();
		//underTest.organicTick();
		underTest.tick();
		int result4 = underTest.getPoo();
		assertEquals(result1, 4);
		assertEquals(result2, 5);
		assertEquals(result3, 6);
		assertEquals(result4, 0);
	}
	
	@Test
	public void dogHealthShouldDecreaseOverTime() {
		underTest.flexAction();
		double result1 = underTest.getHealth();
		assertEquals(100, result1, .1);
		underTest.tick();
		double result2 = underTest.getHealth();
		assertEquals(90, result2, .1);
		underTest.tick();
		double result3 = underTest.getHealth();
		assertEquals(80, result3, .1);
		
	}
}
