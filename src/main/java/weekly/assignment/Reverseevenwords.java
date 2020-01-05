package weekly.assignment;

public class Reverseevenwords {

	public static void main(String[] args) {
		// Here is the input
		String inputSentence = "I am a software tester";
		String reverseStr = "";

		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)

		/*
		 * Pseudo Code: a) split the words and have it in an array b) Traverse through
		 * each word (using loop) c) find the odd index within the loop (use mod
		 * operator) d) Convert words to character array if the position is even else
		 * print the word as it is(concatenate space at the end). e) print the even
		 * position words in reverse order using another loop (nested loop)
		 * 
		 */
		String[] inputWords = (inputSentence.split(" "));
		for (int i = 0; i < inputWords.length; i++) {
			if (i % 2 != 0) {
				char[] evenwordchars = inputWords[i].toCharArray();
				for (int j = evenwordchars.length-1; j >= 0; j--) {
					reverseStr = reverseStr.concat(String.valueOf(evenwordchars[j]));
				}
				//System.out.println(reverseStr);
			} else 
			{
				reverseStr = reverseStr + inputWords[i];
				
			}
			reverseStr = reverseStr + " ";
			
			
			
		}
		
		System.out.println(reverseStr);
	}
}






