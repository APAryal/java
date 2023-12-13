//Inetaddress
import java.io.*;
import java.net.*;
public class Inet{
    public static void main(String[]args){
        try{
            InetAddress address=InetAddress.getByName("www.youtube.com");
            System.out.println(address);
            InetAddress add=InetAddress.getByName("172.217.166.174");
            System.out.println(add.getHostName());
            InetAddress ad=InetAddress.getLocalHost();
            System.out.println("my address is:"+ad.getHostAddress());
            System.out.println("my localhostname is:"+ad.getHostName());
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
}
}