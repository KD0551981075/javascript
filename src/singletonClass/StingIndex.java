package singletonClass;

//Java implementation of the approach 
import java.lang.Character; 

class StingIndex 
{ 

	static int MAX = 26; 

	public static String getSortedString(StringBuilder s, int n) 
	{ 

		// To store the frequencies of the 
		// lowercase and the uppercase 
		// characters in the given string 
		int[] lower = new int[MAX]; 
		int[] upper = new int[MAX]; 

		for (int i = 0; i < n; i++) 
		{ 

			// If current character is lowercase then 
			// increment its frequency in 
			// the lower[] array 
			if (Character.isLowerCase(s.charAt(i))) 
				lower[s.charAt(i) - 'a']++; 

			// Else increment in the upper[] array 
			else if (Character.isUpperCase(s.charAt(i))) 
				upper[s.charAt(i) - 'A']++; 
		} 

		// Pointers that point to the smallest lowercase 
		// and the smallest uppercase characters 
		// respectively in the given string 
		int i = 0, j = 0; 
		while (i < MAX && lower[i] == 0) 
			i++; 

		while (j < MAX && upper[j] == 0) 
			j++; 

		// For every character in the given string 
		for (int k = 0; k < n; k++) 
		{ 

			// If the current character is lowercase 
			// then replace it with the smallest 
			// lowercase character available 
			if (Character.isLowerCase(s.charAt(k))) 
			{ 
				while (lower[i] == 0) 
					i++; 
				s.setCharAt(k, (char) (i + 'a')); 

				// Decrement the frequency 
				// of the used character 
				lower[i]--; 
			} 

			// Else replace it with the smallest 
			// uppercase character available 
			else if (Character.isUpperCase(s.charAt(k))) 
			{ 
				while (upper[j] == 0) 
					j++; 
				s.setCharAt(k, (char) (j + 'A')); 

				// Decrement the frequency 
				// of the used character 
				upper[j]--; 
			} 
		} 

		// Return the sorted string 
		return s.toString(); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		StringBuilder s = new StringBuilder("gEeksfOrgEEkS"); 
		int n = s.length(); 
		System.out.println(getSortedString(s, n)); 
	} 
} 

//This code is contributed by 
//sanjeev2552 

