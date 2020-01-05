package day2.classroom.arrays;

import java.util.Arrays;

public class Findsecondlargest {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 
		 
		 2) Pick the last but one and print
		 */
		
		Arrays.sort(data);
		int i = data.length;
		int seclast=data[i-1];
		System.out.println(seclast);
		
		
		
		
	}

}
