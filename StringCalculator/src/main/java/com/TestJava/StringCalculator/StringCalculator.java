package com.TestJava.StringCalculator;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
	public int sum = 0;
     public int Add(String numbers)
     {
    	 if(numbers.isEmpty())
    	 {
    		return 0;
    	 }
    	 else if (numbers.contains(",")) {
			String [] number = numbers.split(",");
			for (int i = 0; i < number.length; i++) {
				sum += changeToInt(number[i]); 
			}
			return sum;
		 } 
    	 return changeToInt(numbers);
     }
     public int changeToInt( String number) {
    	return Integer.parseInt(number); 
     }
}
