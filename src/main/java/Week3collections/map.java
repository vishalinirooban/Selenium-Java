package Week3collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class map {
public static void main(String[] args) {
	Map<String,Integer> studentsrec = new TreeMap();
	
	studentsrec.put("D", 20);
	studentsrec.put("E", 25);
	studentsrec.put("A", 5);
	studentsrec.put("B", 10);
	studentsrec.put("C", 15);`
	//System.out.println(studentsrec);
	
	for(Entry<String, Integer>  ent : studentsrec.entrySet())
	{
		System.out.println(ent.getKey()  +"  " + ent.getValue());
	}
	
	
	for (String Key : studentsrec.keySet()) {
		System.out.println(Key  +"  " + studentsrec.get(Key));
	}
}
}
