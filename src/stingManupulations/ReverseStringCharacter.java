package stingManupulations;

public class ReverseStringCharacter 
{
	
	public static void main(String args[])
	{
		char[] JavaCharArray = {'r', 's', 't', 'u', 'v'};
	  // char[] s = {"h","e","l","l","o"};
		reverseString(JavaCharArray);
	}

	public static void reverseString(char[] s) 
	{
     for(int i= 0;i<s.length/2;i++)
     {
    	 char temp = s[i];
    	 s[i] = s[s.length-1-i];
    	 s[s.length-1-i] = temp;	
     }
     System.out.println(s);
    }

	
}
