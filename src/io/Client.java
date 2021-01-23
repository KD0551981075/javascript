package io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main() throws UnknownHostException, IOException
	{
		Socket s = new Socket("localhost",9999);
		
		DataOutputStream dos = new DataOutputStream(new DataOutputStream(s.getOutputStream()));
		dos.writeUTF("sup server");
		
		dos.flush();
		dos.close();
		s.close();
	}
}
