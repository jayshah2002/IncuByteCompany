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
	    chandrayan.setPosition(3,5,1);
	    chandrayan.setDirection(Direction.W);
	    chandrayan.moveForward();
	    assertEquals("(-1, 0, 0)", chandrayan.getPosition());
	    assertEquals(Direction.W, chandrayan.getDirection());

		// Test case 4
	    chandrayan.setPosition(0, 0, 0);
	    chandrayan.setDirection(Direction.S);
	    chandrayan.moveForward();
	    assertEquals("(3,5,0)", chandrayan.getPosition());
	    assertEquals(Direction.S, chandrayan.getDirection());

		// Test case 5
	    chandrayan.setPosition(-1, -1, -1);
	    chandrayan.setDirection(Direction.S);
	    chandrayan.moveForward();
	    assertEquals("(-1, -1, -2)", chandrayan.getPosition());
	    assertEquals(Direction.S, chandrayan.getDirection());

		// Test case 6
	    chandrayan.setPosition(2,-3,4);
	    chandrayan.setDirection(Direction.W);
	    chandrayan.moveForward();
	    assertEquals("(-1, -1, -2)", chandrayan.getPosition());
	    assertEquals(Direction.W, chandrayan.getDirection());
	}

	//Initially it will be failed
	@Test
	public void testMoveBackward()
	{
	    // Test case 1
	    chandrayan.moveBackward();
	    assertEquals("(0, 1, 0)", chandrayan.getPosition());
	    assertEquals(Direction.N, chandrayan.getDirection());

	    // Test case 2
	    chandrayan.setPosition(0,0,0);
	    chandrayan.setDirection(Direction.S);
	    chandrayan.moveBackward();
	    assertEquals("(0,-1,0)", chandrayan.getPosition());
	    assertEquals(Direction.S, chandrayan.getDirection());

	    // Test case 3
	    chandrayan.setPosition(-1,-1,-1);
	    chandrayan.setDirection(Direction.S);
	    chandrayan.moveBackward();
	    assertEquals("(-1,-1,-2)", chandrayan.getPosition());
	    assertEquals(Direction.S, chandrayan.getDirection());

		// Test case 4
	    chandrayan.setPosition(3,5,1);
	    chandrayan.setDirection(Direction.S);
	    chandrayan.moveBackward();
	    assertEquals("(3,5,2)", chandrayan.getPosition());
	    assertEquals(Direction.S, chandrayan.getDirection());

		// Test case 5
	    chandrayan.setPosition(0,0,0);
	    chandrayan.setDirection(Direction.W);
	    chandrayan.moveBackward();
	    assertEquals("(1,0,0)", chandrayan.getPosition());
	    assertEquals(Direction.W, chandrayan.getDirection());

		// Test case 6
	    chandrayan.setPosition(1,0,-1);
	    chandrayan.setDirection(Direction.E);
	    chandrayan.moveBackward();
	    assertEquals("(0, 0, 1)", chandrayan.getPosition());
	    assertEquals(Direction.E, chandrayan.getDirection());
	}
   
}
// {1, 0, 1, Direction.E, "b", "(0, 0, 1)", Direction.E},
//                 {0, 0, 0, Direction.W, "b", "(1, 0, 0)", Direction.W},
//                 {0, 0, 0, Direction.N, "b", "(0, -1, 0)", Direction.S},

//                 {-1, -1, -1, Direction.S, "b", "(-1, -1, -2)", Direction.S},
//                 {2, -3, 4, Direction.W, "b", "(2, -3, 3)", Direction.W},
//                 {0, 0, 0, Direction.E, "b", "(-1, 0, 0)", Direction.E},
//                 {3, 5, 1, Direction.S, "b", "(3, 5, 2)", Direction.S},
