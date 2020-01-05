package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int range;
		int firstnum = 0;
		int secNum = 1;
		// Iterate from 1 to the range
		for (range=1 ; range<=8; range++)
		
			// Print first number
		{
			System.out.println(firstnum);
		
			
			// add first and second number
			int add =firstnum+secNum;
		
			
			// Assign second nuumber to the first number
		   firstnum = secNum;
			
			// Assign sum to the second number
		   secNum = add;
			
		}

	}

}
