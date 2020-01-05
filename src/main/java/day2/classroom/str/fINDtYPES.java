package day2.classroom.str;

public class fINDtYPES {
	public static void main(String[] args)
	{
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] data = test.toCharArray();
		System.out.println(data);

		for (int i = 0; i < data.length; i++) {
			if (Character.isLetter(data[i])) {
				letter++;
			}
			else if (Character.isDigit(data[i]))
         {
        	 num++;
         }
			else if (Character.isWhitespace(data[i]))
         {
        	 space++;
         }
         else
         {
        	 specialChar++;
         }
		}  
		System.out.println(letter);
		System.out.println(num);
		System.out.println(space);
		System.out.println(specialChar);
		
		
		
		
	}
}