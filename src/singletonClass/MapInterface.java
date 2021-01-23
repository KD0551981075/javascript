package singletonClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {
	
	public static void main(String args[])
	{
		Map<Integer,String> has = new HashMap<>();
		has.put(100,"Amit");  
		has.put(101,"Vijay");  
		has.put(102,"Rahul");  
		//iterate
		//System.out.println("iterating over the map"+has.keySet());
		for(Entry<Integer, String> m:has.entrySet())
		{
			//System.out.println(""+m.getKey()+" : "+m.getValue());
		}
		has.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
	
	
	

}
