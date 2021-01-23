package stingManupulations;

public class ReverseEachWordInString {

	public static void main(String args[]) {
		
		String inputString = "hellow world";
		System.out.println(reverseWord(inputString));
	}

	public static String reverseWord(String inputString) {

		String reverseString = ""; 
		
		String words[] = inputString.split("//s");
		for(String each:words)
		{
			StringBuffer sb = new StringBuffer(each);
			sb.reverse();
			reverseString  += sb.toString()+" ";
		}
		
		return reverseString.trim();
	}
}
