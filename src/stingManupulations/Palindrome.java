package stingManupulations;

public class Palindrome {
	public static void main(String args[])
	{
		System.out.println(isPlaindrome("aba"));
	}

	public static int isPlaindrome(String S) {
		StringBuffer sb = new StringBuffer(S); 
		String SCopy = sb.reverse().toString();
		if(S.equals(SCopy))
			return 1;
		else
			return 0;
    }
}
