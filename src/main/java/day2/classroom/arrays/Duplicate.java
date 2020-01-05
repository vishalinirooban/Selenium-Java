package day2.classroom.arrays;

import java.util.Arrays;

public class Duplicate {
	
	public static void main(String[] args) {

		// Here is the input
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
	
		
		
		
		
		// Print the second largest number	
		
		Arrays.sort(data);
		for(int i=1; i<data.length ; i++)
		{
		if (data [i-1]==data [i])
		{
		System.out.println("Then duplicates are" + data[i-1]);
		}
		}
		
		
	}

}

