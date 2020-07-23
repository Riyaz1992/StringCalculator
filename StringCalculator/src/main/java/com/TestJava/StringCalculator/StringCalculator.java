package com.TestJava.StringCalculator;

import java.util.List;

import org.graalvm.compiler.virtual.phases.ea.PartialEscapeBlockState.Final;


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
    	 for (String number: splitNumbers) {
    		 if(!number.trim().isEmpty()) {
			     sum += changeToInt(number);
    		 }
		}
    	 return sum;
     }
     
}
