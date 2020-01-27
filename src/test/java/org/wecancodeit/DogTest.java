package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	Dog underTest = new Dog(null, null, 0, 0, 0, 0);
	
	@Test
	public void typeShouldSayDog() {
		String result = underTest.getType();
		assertEquals("Dog", result);
	}

}
