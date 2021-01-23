package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Arrays {

	public static void  main(String[] args) throws Exception {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter an integer");
		  int a =Integer.parseInt(br.readLine()); 
		  System.out.println("Enter a String");
		  String b = br.readLine(); 
		  System.out.printf("You have entered:- " + a +" and name as " + b);
		  int outside = 0 ;
		  for (int i = 0; i < 10; i++) 
		  {
		  outside = i;
		  } 
		  System.out.println("i" + outside);
		 
		///ArrayList<String> container = Collection.emptylist();
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("bjbsj");
		arr.add("hello");
		arr.add("hello");
		arr.add("adad");

		
		/*
		 * Collections.synchronizedList(arr); System.out.println("syn"+arr);
		 * 
		 * System.out.println("arr"+arr); int[] a = {}; arr.toArray(new
		 * String[arr.size()]); //Arrays.asList(a); //
		 * Collections.unmodifiableList(arr); Collections.reverse(arr);
		 * Collections.sort(arr,); System.out.println("reversing"+arr); //removing the
		 * duplicates in the likedList HashSet<String> has = new HashSet<>(arr);
		 * System.out.println("has"+has); arr.clear(); System.out.println("arr"+arr);
		 * arr = new ArrayList<String>(has); System.out.println("arr"+arr);
		 * 
		 * 
		 * int[10] a = {1,2,3,4,4,5,5,6,6,7}; a.
		 */
		
	}
}
