package coding;

public class GarbageCollection {

	int number = 12;
	void printGarbage()
	{
		System.out.println("printGarbage");
	}
	
	
	public void finalize()
	{
		System.out.println("inside finalize");
	}
	public static void main(String args[])
	{
	   new GarbageCollection().printGarbage();
	   new GarbageCollection().printGarbage();
	   System.gc();
	}
}
