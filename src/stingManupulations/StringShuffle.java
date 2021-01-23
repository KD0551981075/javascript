package stingManupulations;

public class StringShuffle {

	public static void main(String args[])
	{
		System.out.println(shuffle());
	}
	
	public static int shuffle()
	{
		String first,second,result;
		first = "XY";
		second = "12";
		result = "Y12X";
		
		int f = 0;
		int s = 0;
		
		int total = (first+second).length();
		if(!(total == result.length()))
			return 0;
			
		for(int i=0;i<result.length()-1; i++)
		{
			if (f < first.length() && first.charAt(f) == result.charAt(i))
				f++;
			
			else if (s < second.length() && second.charAt(s) == result.charAt(i))
				s++;
			
			else
				return 0;
			
		}
		return 1;
	}
}
