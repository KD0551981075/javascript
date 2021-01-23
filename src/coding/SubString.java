package coding;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;

class SubString {
	public static void main(String[] args) {
		// code
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		// n
		for (int i = 0; i < total; i++) {
			// size
			// int size = sc.
			// exp
			// int totalExp = sc.nextInt();
			// int arrayValues = sc.nextInt();
		}
		/*
		 * public int subCount(int size,int expectedSum) {
		 * 
		 * 
		 * }
		 */

	}
}

class Base  
{  
//    void method(int a)  
//    {  
//        System.out.println("Base class method called with integer a = "+a);  
//    }  
       
    void method(double d)  
    {  
        System.out.println("Base class method called with double d ="+d);  
    }  
}  
   
class Derived extends Base  
{  

    @Override  
    void method(double d)  
    {  
        System.out.println("Derived class method called with double d ="+d);  
    }  
}  
   
class MainDerived  extends Derived implements Serializable, Cloneable
{      
    public static void main(String[] args)  
    {  
    	MainDerived md = new MainDerived();
    	
        new Derived().method(10);  
        System.out.println(md instanceof Base);
    }  
}  