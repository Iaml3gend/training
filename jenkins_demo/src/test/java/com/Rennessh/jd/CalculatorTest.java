package com.Rennessh.jd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
	Calculator c;
	@Before
	public void setUp() throws Exception{
		c = new Calculator();
		
	}
@After
public void tearDown() throws Exception{
	c=null;
}
@Test
public void testSum() {
	assertEquals(35,c.sum(5,6,7,8,9));
}
@Test
public void testSquare() {
	assertEquals(25,c.square(5));
}
@Test
public void testPower() {
	assertEquals(32,c.power(2,5));
}

}

