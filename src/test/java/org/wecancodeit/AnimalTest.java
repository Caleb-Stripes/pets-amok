package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	Animal underTest = new Animal("harry", "fat and harry");
	
	@Test
	public void animalNameShouldBeHarry() {
	String result = underTest.getName();
	assertEquals(result, "harry");
	}
	
	@Test
	public void animalDescriptionShouldBeFatAndHarry() {
		String result = underTest.getDescription();
		assertEquals(result, "fat and harry");
	}

}
