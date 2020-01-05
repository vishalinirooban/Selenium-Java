package Week3collections;

import java.util.ArrayList;
import java.util.List;

public class list {
	


	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		for(int i=101 ; i<=200; i++)
		{
			numbers.add(i);
		}
		
		for(int i=0 ; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		
		
		
		
		
	}
	

}
