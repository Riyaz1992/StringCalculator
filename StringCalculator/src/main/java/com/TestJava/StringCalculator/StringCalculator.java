package com.TestJava.StringCalculator;
/**
 * Hello world!
 *
 */
public class StringCalculator 
{
	private final int MaxNumberLimit = 1000;
	private int sum = 0;
     public int Add(String numbers)
     {
    	 if(numbers.isEmpty())
    	 {
    		return 0;
    	 }
    	 else if(numbers.length() ==1)
    	 {
    		 return changeToInt(numbers);
    	 }
    	 else {
    		 return GetNumber(numbers);
		}
    	 
     }
     public int changeToInt( String number) {
    	return Integer.parseInt(number); 
     }
     public int GetNumber(String numbers)
     {
    	 String[] splitNumbers = numbers.split(",|\n");
    	 for (String number: splitNumbers) {
			sum += changeToInt(number);
		}
    	 return sum;
     }
}
