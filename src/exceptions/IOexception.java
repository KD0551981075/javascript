package exceptions;

import java.util.*;

import coding.BinaryTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOexception extends BinaryTree {
	
	public void itshappeningHere()
	{
		List<String> groupData = new ArrayList<>();
		
		File file = new File("text.txt");
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream(file);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fileInputStream!=null)
					fileInputStream.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String args[])
	{
		BinaryTree bt = new BinaryTree();
		IOException io =new IOException();
		bt.printPostorder(null);
		
		IOexception creatingObject = new IOexception();
		creatingObject.itshappeningHere();
	}

}
