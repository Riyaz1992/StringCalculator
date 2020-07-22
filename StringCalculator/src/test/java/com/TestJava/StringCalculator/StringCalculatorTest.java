package com.TestJava.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class StringCalculatorTest 
{
	@Test
	public void emptyString()
	{
		StringCalculator calculator = new StringCalculator();
		assertEquals(calculator.Add(""),0);
	}
}
