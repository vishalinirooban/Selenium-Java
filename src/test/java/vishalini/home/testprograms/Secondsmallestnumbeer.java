package vishalini.home.testprograms;

import java.util.Arrays;

public class Secondsmallestnumbeer {
	
	public static void main (String[] args) {
     
		int[] array = {1,2,5,6,3,2};
		
	Arrays.sort(array);
	int i = 0;
	int secsmall = array [i+1];
	System.out.println(secsmall);
		
	}
}