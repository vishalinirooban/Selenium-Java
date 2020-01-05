package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Removedups2 {
	public static void main(String[] args) {
		
		Set<Character> dups = new TreeSet<Character>();
		Set<Character> outputdups = new LinkedHashSet<Character>();
		
		String input = "Infosys Limited";
		char[] chars = input.toCharArray();
		
		for(int i=1 ; i<chars.length ; i++)
		{
			//System.out.println(chars[i]);
			if(chars[i-1]==chars[i])
{
		System.out.println(dups.contains(chars[i-1]));
		outputdups.add(chars[i]);
}
				else
				{
				     System.out.println( dups.add(chars[i]));
				}
			}
		System.out.println(outputdups);
		
	}}


