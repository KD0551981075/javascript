package coding;

import java.util.ArrayList;

public class Int {
	public static int getIntegerValue(String x,int length,char search)
	{
		int count = 0;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i) == search)
			{
				count++;
			}
		}
		int repetition = length/x.length();
		count = count*repetition;
		
		for(int i=0;i<length%x.length();i++)
		{
			if(x.charAt(i)==search)
				count++;
		}
		
		return count;
		
	}
public static void main(String args[])
{
	String intergerValue = "abda";
	int length = 10;
	char search = 'a';
	System.out.println("getIntegerValue(integerValue)"+getIntegerValue(intergerValue,length,search));
	
	}
}
