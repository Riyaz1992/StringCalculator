package com.TestJava.StringCalculator;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
public class StringCalculator 
{
	private String delimiter= ",|\n";
	private final String customdelimiter= "//";
	private int sum = 0;
    public int Add(String numbers)
    {
    	 if(numbers.isEmpty())
    	 {
    		return 0;
    	 }
    	 else if(numbers.length() == 1)
    	 {
    		 return changeToInt(numbers);
    	 }
    	 else if(numbers.startsWith(customdelimiter))
    	 {
    	     int index = numbers.indexOf("//")+2;
    	     delimiter = numbers.substring(index,index+1);
    	     String excludeString = numbers.substring(numbers.indexOf("\n") + 1);
    	     return GetNumber(excludeString, delimiter);
    	 } 
    	 else {
    		 return GetNumber(numbers,delimiter);
		}
    	 
     }
     public int changeToInt( String number) {
    	return Integer.parseInt(number); 
     }
     public int GetNumber(String numbers, String delim) 
     {
    	 String[] splitNumbers = numbers.split(delim);
    	 List<Integer> negativeNumbers = new ArrayList();
    	 for (String number: splitNumbers) 
    	 {
    		   if(changeToInt(number)<0)
    		   {
    			     negativeNumbers.add(changeToInt(number));
    		   }
			   sum += changeToInt(number);
		}
    	if(negativeNumbers.size()>0)
    	{
    		   throw new RuntimeException("negatives not allowed"+ "-" + negativeNumbers.toString());
    	}
    	 return sum;
     }
     
}
