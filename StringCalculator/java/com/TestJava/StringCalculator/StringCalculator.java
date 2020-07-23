package com.TestJava.StringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringCalculator 
{
    public int Add(String numbers)
    {
    	 if(numbers.isEmpty())
    	 {
    		return 0;
    	 }
    	 
    	 return GetNumber(numbers);
		 
     }
     public int changeToInt( String number) {
    	return Integer.parseInt(number); 
     }
     public int GetNumber(String numbers) 
     {
    	 int sum = 0;
    	 List<Integer> negativeNumbers = new ArrayList();
         Pattern p = Pattern.compile("-?\\d+");
         Matcher m = p.matcher(numbers);
         while(m.find()) {
         	int number = Integer.parseInt(m.group());
         	if(number<0){
 			     negativeNumbers.add(number);
 		       }
 		    else if(number<= 1000) {
 			   sum += number;
 		    }      
         }
    	if(negativeNumbers.size()>0)
    	{
    		   throw new RuntimeException("negatives not allowed"+ "-" + negativeNumbers.toString());
    	}
    	 return sum;
     }
     
}
