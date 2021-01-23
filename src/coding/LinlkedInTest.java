package coding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public  class LinlkedInTest {
	 String s = "";
	public static void main(String args[])
	{
		List theList = new ArrayList<>() ;
		theList.add("sfdfsfds");
		theList.add("sdfsdfdsfdsf");
		theList.forEach(System.out::println);
		for(Object object : theList)
		{
			System.out.println(object);
		}
		boolean ti = theList.iterator().hasNext();
		Date date = new Date(System.currentTimeMillis());	
		String newDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println("date"+date+"newDate"+newDate);
		
		
	}
	public void printing()
	{
		System.out.println("");
	}
  static class InnerClass
   {
	  static class InnerClass2
	   {
		  static class InnerClass3
		   {
			 LinlkedInTest lit = new LinlkedInTest(){
					 public void printing() 
					 {
						 System.out.println("supInside");
					 }}; 
	   }
	   
   }
	
}}
