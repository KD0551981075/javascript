package io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Scanner;

public class Buffer implements Serializable {
	public static void main(String args[]) throws IOException {
		// "using bufferReader");
		/*
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 * String reading = bf.readLine(); System.out.println("enter"+reading);
		 */

		// scanner
		/*
		 * Scanner sc = new Scanner("Hello/This is JavaTpoint/My name is Abhishek");
		 * System.out.println("sc.hasNextBoolean()" + sc.hasNextBoolean()); //
		 * sc.useDelimiter("/"); System.out.println("printing tokens"); while
		 * (sc.hasNext()) System.out.println("sc.next()" + sc.next());
		 * 
		 */

		// console
		/*
		 * Console c = System.console(); System.out.println("writing something"); String
		 * readLine = c.readLine(); System.out.println("readlinke"+readLine);
		 */

		Integer i = new Integer(125);
		Integer j = new Integer(125);
		if (i == j) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}
	}

}
