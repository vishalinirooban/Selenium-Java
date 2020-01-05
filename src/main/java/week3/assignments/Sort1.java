package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort1 {
	
	public static void main(String[] args) {
		List<String>reverseString= new ArrayList();
		reverseString.add("HCL");	
	   	reverseString.add("Aspiresystems");
	   	reverseString.add("Cts");
	   	reverseString.add("UST");
	   	
	 	//System.out.println(reverseString);
	 	Collections.sort(reverseString);
	 	Collections.reverse(reverseString);
	 	for (String rev : reverseString) {
			System.out.println(rev);
		}
	}

}
