package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatTest {

	Cat underTest = new Cat(null, null, 0, 0, 0, 0);
	
	@Test
	public void typeShouldBeCat() {
		String result = underTest.getType();
		assertEquals(result, "Cat");
	}
	
	//@Test
	//public void shouldAddToLitterBox()

}
