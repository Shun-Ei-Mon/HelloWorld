package com.junit.mm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest {

	private JUnit junitTest;
	
	@Before
	public void setUp() throws Exception {
		junitTest = new JUnit();
	}

	@After
	public void tearDown() throws Exception {
		junitTest = null;
	}

	@Test
	public void test() {
		int result = junitTest.add(5, 5);
		assertEquals(10,result);
		System.out.println("Result=" + result);
	}

}
