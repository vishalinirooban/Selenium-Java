package weekly.assignment;

import java.util.Arrays;

public class Anagram {
	
	public static void main (String[] args)
	{
		 //Declare a String 
		String text1 = "stop";
		//Declare another String
		String text2 = "pots";
		
		//build logic to check the given words are anagram or not
		
		/*
		 * Pseudo Code
		 * a) Check length of the strings are same then
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		int a = text1.length();
		System.out.println(a);
		int b = text2.length();
		System.out.println(b);
		
		if(a==b)
		{
		System.out.println("Length of the both the string are same");
		
	}
		char [] data1 = text1.toCharArray();
		for(int i=0; i<data1.length; i++)
		{
			System.out.println(data1[i]);
		}
		char[] data2 =text2.toCharArray();
		for(int i=0; i<data2.length; i++)
		{
			System.out.println(data2[i]);
		}

          Arrays.sort(data1);
          Arrays.sort(data2);
          
          int arraylen1 = data1.length;
          System.out.println(arraylen1);
          int arraylen2 = data2.length;
          System.out.println(arraylen2);
          
       if(arraylen1==arraylen2)
       {
    	   System.out.println("Length of the both the string are same");
       }
          
		
			
		
	}

}
