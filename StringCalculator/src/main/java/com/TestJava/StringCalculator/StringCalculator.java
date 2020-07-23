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
    	 else if (numbers.contains(",")) {
			String [] number = numbers.split(",");
			return Integer.parseInt(number[0])+Integer.parseInt(number[1]);
		} 
    	 return Integer.parseInt(numbers);
     }
}
