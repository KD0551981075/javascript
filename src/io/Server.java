package io;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.Class;

public class Server {

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		
		DataInputStream ois = new DataInputStream(s.getInputStream());
	    String msg = ois.readUTF();
	    
	    ss.close();
	    Class.forName("Server");
	    
	}
}

class sub
{
	public static void main() throws ClassNotFoundException
	{

	Class.forName("Server");
	Serv
	
	}}