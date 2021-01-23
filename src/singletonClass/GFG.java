package singletonClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class GFG {
public static void main(String args[]) throws IOException
{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Vector<String> into = new Vector<String>();
	int number = sc.nextInt();
	for (int i=0; i<number;i++)
	{
		String st = bf.readLine();
		into.add(st);
	} 
	Iterator<String> it = into.iterator();
	while(it.hasNext())
	 System.out.println(sorting(it.next()));
	
}
public static String sorting(String s)
	{
		if (s != null) {
			char[] array = s.toCharArray();
			Arrays.sort(array);
			return new String(array);
		} else
			return s;
	}
}
