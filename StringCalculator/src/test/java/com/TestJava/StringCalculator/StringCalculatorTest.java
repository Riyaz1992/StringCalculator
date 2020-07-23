package com.TestJava.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
/**
 * Unit test for simple App.
 */
public class StringCalculatorTest 
{
	StringCalculator calculator;
	@Before
	public void init() {
		calculator = new StringCalculator();	
	}
	@Test
	public void emptyString()
	{
		assertEquals(calculator.Add(""),0);
	}
	@Test
	public void singleValue() {
	   assertEquals(calculator.Add("1"),1);	
	}
}
