package singletonClass;

import java.util.*;
import java.util.Map.Entry;

public class CollectionClasss {
	public static void main(String args[])
	{
		
		  ArrayList<String> arrlist = new ArrayList<>();
		  LinkedList<String> linklist =new LinkedList<>(); 
		  Vector<String> vector = new Vector<>(); 
		  Stack<String>stack = new Stack<>();
		  
		  arrlist.add("hello world");
		  arrlist.add("hello world");
		  arrlist.add("hello world");
		  arrlist.add("hello world");
		  ListIterator<String> ite = arrlist.listIterator(2);
		  while(ite.hasNext())
		  {
			  System.out.println(ite.next());
		  }
		 
		
		  PriorityQueue<String> priority = new PriorityQueue<>(); 
		  priority.add("Amit");  
		  priority.add("Vijay");  
		  priority.add("Karan");  
		  priority.add("Jai");  
		  priority.add("Rahul");  
		  Iterator<String> loop = priority.iterator();
		  //while(loop.hasNext())
		  {
			 // System.out.println(loop.next());
		  }
		  Deque<String> dequeue = new ArrayDeque<>();
		  
		  LinkedHashSet<String> hashSet = new LinkedHashSet<>(); hashSet.add(null);
		  
		 // System.out.println(hashSet.iterator().next());
		 
		
		TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
		tree.put(4,"D");  
		tree.put(5,"E"); 
		tree.put(1,"B");  
		tree.put(2,"B");  
		tree.put(3,"C");  
		 
		Iterator<Entry<Integer, String>> iterator = tree.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		//System.out.println("printing tree"+tree.descendingIterator());
		//System.out.println("printing tree"+tree.tailSet("C", false));
		
	}

}
