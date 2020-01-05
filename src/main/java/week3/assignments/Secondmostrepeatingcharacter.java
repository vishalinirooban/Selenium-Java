package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Secondmostrepeatingcharacter {
public static void main(String[] args) {
		
		Set<Character> dups = new TreeSet<Character>();
		Set<Character> outputdups = new TreeSet<Character>();
		
	String input = "PayPaal";
	            char[] chars = input.toCharArray();
	for(int i = 0; i < chars.length; i++) {
		
		if(dups.contains(chars[i]))
				{
			System.out.println(dups);
			outputdups.add(chars[i]);
		     outputdups.remove(chars[1]);
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


