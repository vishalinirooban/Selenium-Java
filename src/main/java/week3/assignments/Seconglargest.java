package week3.assignments;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seconglargest {
	public static void main(String[] args) {
		
	Map<Character,Integer> namecount = new HashMap<Character,Integer>();
	
	
	String input = "PayPaal";
  char[] chars =   input.toCharArray();
  for(int i = 0; i < chars.length; i++) {
	  if(namecount.containsKey(chars[i]))
	{
		
		namecount.put(chars[i], namecount.get(chars[i])+1);
		System.out.println(namecount);
	}
	else
	{
		namecount.put(chars[i], 1);
		System.out.println(namecount);
	}
	//System.out.println(namecount);
}
 
    System.out.println(namecount);
    
    
}
}