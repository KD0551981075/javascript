package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class StringManupilation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		
		System.out.println(ip(a));
	}
    public static String ip(String a)
    {
    	String regex = "[0-9] {3}[.]";
        Long first = Long.parseLong(a);
       
        
        return String.valueOf(first);
    }
}

