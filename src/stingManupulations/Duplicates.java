package stingManupulations;

import coding.Int;

public class Duplicates {

	static final int NO_OF_CHARS = 256; 
	
	public static void main(String args[])
	{
		countDuplicates("geeksforgeeks");
	}
	
	//source : geekforgeeks
	public static void countDuplicates(String str)
	{
		int[] count = new int[NO_OF_CHARS];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<NO_OF_CHARS;i++)
		{
			if(count[i]>1)
			{
				System.out.println(" "+(char)(i)+":"+count[i]);
			}
		}
		
	}
}
