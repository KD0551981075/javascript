package stingManupulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String args[]) throws IOException
	{
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		Integer n = Integer.parseInt(bf.readLine());
//		for(int i=0;i<n;i++)
//		{
//			String input = bf.readLine();
//			printReverse(input);
//		}
		
		System.out.println(checking());
	}

	private static void printReverse(String input) {
		// TODO Auto-generated method stub
		char array[] = input.toCharArray();
		int length = array.length-1;
		int temp[] = null ;
		for(int i=0;i<array.length;i++)
		{
			temp[i] = array[length-i];
		}
	}
	
	public static int checking()
	{
		String main = "ABACD";
		//String temp = main+main;
		String sub  = "CDABA";
		StringBuffer sb = new StringBuffer(sub);
		String reverse = sb.reverse().toString();
		System.out.println("main: "+main+" sub: "+reverse);
		if(main.equals(reverse))
		{
			return 1;
		}
		else
			return 0;
		
		//System.out.println(temp.indexOf(sub));
	}
}
