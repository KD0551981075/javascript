package io;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import exceptions.IOexception;

class SerializableClass implements Externalizable {
	int rollNumber;
	String name;

	public SerializableClass(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}

class Class2 extends SerializableClass {

	float salary;

	public Class2(int rollNumber, String name, float salary) {
		super(rollNumber, name);
		this.salary = salary;
	}
}

public class MainClass
{
	public static void main(String args[]) throws Exception
	{
		Class2 c2 = new Class2(12, "Datta", 46650);
		System.out.println("class2 details"+c2);
		
		FileOutputStream fos = new FileOutputStream("fos.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c2);
		
		oos.close();
		fos.close();
		
		System.out.println("class2 details"+c2);
		
	}
	
	}
