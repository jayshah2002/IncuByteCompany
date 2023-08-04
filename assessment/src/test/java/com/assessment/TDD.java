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
	    chandrayan.moveForward();
	    assertEquals("(0, 1, 0)", chandrayan.getPosition());
	    assertEquals(Direction.N, chandrayan.getDirection());

	    // Test case 2
	    chandrayan.setPosition(1, 0, 1);
	    chandrayan.setDirection(Direction.E);
	    chandrayan.moveForward();
	    assertEquals("(2, 0, 1)", chandrayan.getPosition());
	    assertEquals(Direction.E, chandrayan.getDirection());

	    // Test case 3
	    chandrayan.setPosition(0, 0, 0);
	    chandrayan.setDirection(Direction.W);
	    chandrayan.moveForward();
	    assertEquals("(-1, 0, 0)", chandrayan.getPosition());
	    assertEquals(Direction.W, chandrayan.getDirection());
	}
   
}
