package com.tasmc.util.test;


import junit.framework.TestCase;
import com.tasmc.util.*;

public class Addition_Test extends TestCase {
	private int x = 0;
	private int y = 0;
	
	protected void setUp() {
		x = 4;
		y = 5;
	}
	
	protected void tearDown() {
		x = 0;
		y = 0;
	}
	
	public void testAddition() {
		System.out.println("Test use of Addition class");
		
		int z = Addition.twoValues(x, y);
		System.out.println("Result: " + z);
		
		assertEquals(9,z);  //The test
	}
}
