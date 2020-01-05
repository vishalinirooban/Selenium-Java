package week3.assignments;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
   public static void main(String[] args) {
	   Set<String> reverseString = new TreeSet<String>();
	   
	   	reverseString.add("HCL");	
	   	reverseString.add("Aspiresystems");
	   	reverseString.add("Cts");
	   	
	   	System.out.println(reverseString);

	   	
	   	NavigableSet<String> Reverse = ((TreeSet<String>) reverseString).descendingSet();
	   	
	   	System.out.println(Reverse);
	   	
	   
}
}
		