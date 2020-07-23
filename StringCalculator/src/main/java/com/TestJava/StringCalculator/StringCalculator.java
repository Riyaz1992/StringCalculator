package com.TestJava.StringCalculator;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
     public int Add(String numbers)
     {
    	 if(numbers.isEmpty())
    	 {
    		return 0;
    	 }
    	 return Integer.parseInt(numbers);
     }
}
