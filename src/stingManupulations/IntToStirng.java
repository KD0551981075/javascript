package stingManupulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class IntToStirng {
	public static void main(String args[]) throws IOException {
		BufferedReader sb = new BufferedReader(
				new InputStreamReader(System.in));

		String readLine = sb.readLine();
		//meth(readLine);
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("hello");
		System.out.println("arr"+arr);
		int[] a = {}; 
		arr.toArray(new String[arr.size()]);
		Arrays.asList(a);
		Collections.unmodifiableList(arr);
		
		//removing the duplicates in the likedList
		HashSet<String> has = new HashSet<>(arr);
		System.out.println("has"+has);
		arr.clear();
		arr  = new ArrayList<String>(has);
		System.out.println("arr"+arr);
		
		  
	}

	/*
	 * private static void meth(String readLine) { try {
	 * System.out.println(Integer.parseInt(readLine)); } catch(Exception e) {
	 * 
	 * } finally {
	 * 
	 * }
	 * 
	 * }
	 */

}
