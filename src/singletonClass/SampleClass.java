package singletonClass;


public class SampleClass {
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		SampleClass s1 = new SampleClass();
		SampleClass s2 = new SampleClass();
		s1 = null;
		s2 = null;
		System.gc();
	}
}
