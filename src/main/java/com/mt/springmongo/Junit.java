package com.mt.springmongo;

public class Junit {

	
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}


	public void setUp() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	
	public void tearDown() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");	
	}

	
	public final void testMain() {
		fail("Not yet implemented"); // TODO
	}


	private void fail(String string) {
		// TODO Auto-generated method stub
		System.out.println("Set Up Before Class - @BeforeAll");
	}


	public final void testIndex() {
		fail("Not yet implemented"); // TODO
	}

}
