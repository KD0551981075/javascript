package stingManupulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Shifing {

	public static void main(String args[]) throws IOException
	{
		//BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + time + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + "."); 
		reserveOrder(real);
	}

	private static void reserveOrder(String real) {
		char[] carsOfReal = real.toCharArray();
		char[] replica = new char[carsOfReal.length];
		Arrays.sort(carsOfReal);
		int length = carsOfReal.length;
		for (int i = length-1; i >= 0; i--) {
			System.out.print(carsOfReal[i]);
		}
	}

	  
}
