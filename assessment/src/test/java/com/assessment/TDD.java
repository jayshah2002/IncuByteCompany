package com.assessment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TDD {
	@Test
	//sample test case 
	public void Sample()
	{
		assertTrue(true);
	}
	private Chandrayan chandrayan;

	
	//Initially it will be failed
	@Test
	public void testMoveForward()
	{
	    // Test case 1
	    spacecraft.moveForward();
	    assertEquals("(0, 1, 0)", spacecraft.getPosition());
	    assertEquals(Direction.N, spacecraft.getDirection());

	    // Test case 2
	    spacecraft.setPosition(1, 0, 1);
	    spacecraft.setDirection(Direction.E);
	    spacecraft.moveForward();
	    assertEquals("(2, 0, 1)", spacecraft.getPosition());
	    assertEquals(Direction.E, spacecraft.getDirection());

	    // Test case 3
	    spacecraft.setPosition(0, 0, 0);
	    spacecraft.setDirection(Direction.W);
	    spacecraft.moveForward();
	    assertEquals("(-1, 0, 0)", spacecraft.getPosition());
	    assertEquals(Direction.W, spacecraft.getDirection());
	}
   
}
