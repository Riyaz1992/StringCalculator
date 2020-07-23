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
	@Test
	public void SumOfTwoNumbers() {
		assertEquals(calculator.Add("1,2"),3);
	}
	@Test
	public void SumofUnknownNumbers() {
		assertEquals(calculator.Add("1,2,3,4"), 10);
	}
	@Test
	public void newLinesHandleTest() {
		assertEquals(calculator.Add("1\n2,3"), 6);
	}
	@Test
	public void SupportDifferentDelimiter()
	{
		assertEquals(calculator.Add("//;\n1;2"), 3);
	}
	@Test(expected = RuntimeException.class)
	public void SingleNegativeNumberIsUsed()
	{
		calculator.Add("5,-7,3,2,4,6");
	}
}
