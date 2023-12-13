//package apsara;
import java.io.*;
import java.net.*;

public class Myserver {
	public static void main(String[]aggs) {
try {
	ServerSocket ss=new ServerSocket(5000);
	System.out.println("Server is running on port 5000");
	Socket s=ss.accept();
	System.out.println("client connect");
	DataInputStream din=new DataInputStream(s.getInputStream());
	String str=(String)din.readUTF();
	System.out.println("client says="+str);
	ss.close();
	s.close();
	din.close();
}catch(Exception e)
{
	System.out.println(e.getMessage());
    
}
}
}