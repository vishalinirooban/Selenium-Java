package Week3collections;

import java.util.ArrayList;
import java.util.List;

public class Listeven {
public static void main(String[] args) {
	List<Integer> evennum = new ArrayList();
	for(int i=500; i<=600; i++)
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
	for(int i=0 ; i<evennum.size(); i++)
	{
		System.out.println(evennum.get(i));
		i++;
	}
}
}
