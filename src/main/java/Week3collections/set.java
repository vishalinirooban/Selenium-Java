package Week3collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class set {
   public static void main(String[] args) {
	   
	   Set<Integer> evennum = new TreeSet<Integer>();
	   for(int i=700; i<=800; i++)
		{
			if(i%2==0)
			{
				evennum.add(i);
			}
		}
		for(int i=500; i<=600; i++)
		{
			if(i%2==0)
			{
				evennum.add(i);
			}
		}
		//for (Integer value : evennum) {
		//	System.out.println(value);
	//	}
		List<Integer> evenLIST = new ArrayList(evennum);
		for(int i=0 ; i<evenLIST.size(); i++)
		{
			System.out.println(evenLIST.get(i));
			i++;
		}
		
	}
}
