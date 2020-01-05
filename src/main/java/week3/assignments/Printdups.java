package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Printdups {
	public static void main(String[] args) {
		
		Set<Character> dups = new LinkedHashSet<Character>();
		Set<Character> outputdups = new LinkedHashSet<Character>();
		
	String input = "PayPal India";
	            char[] chars = input.toCharArray();
	for(int i = 0; i < chars.length; i++) {
		
		if(dups.contains(chars[i]))
				{
			System.out.println(dups);
			outputdups.add(chars[i]);
		
				}
		else
		{
		     dups.add(chars[i]);
		     System.out.println(dups);
		}
		
		System.out.println(outputdups);
		
	}
}
}
