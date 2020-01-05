package weekly.assignment;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as ""
			 * e) print the each word
			 */
		
		String[] inputwords = text.split(" ");
		//System.out.println(data);
		for (int i = 0 ; i < inputwords.length ; i++)
		//use of foreach - when the increment is available directly(positive iteration)
			{
			//System.out.println(String.valueOf(inputwords[i]));
			for ( int j = 0 ; j < inputwords.length ; j ++)
			{
				
				
			//System.out.println(String.valueOf(inputwords[j]));
			if ( inputwords[i].equals(inputwords[j]))
			{
			
			System.out.println(count);
			//}
			//else
			//{
				
		//	}
			}
			}
		
	}
}
}

