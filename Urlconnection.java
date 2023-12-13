//reaad the conte   nt of url
import java.net.*;
import java.io.*;
public class Urlconnection{
    public static void main(String[]args){
        try{
            URL url=new URL("https://www.gogole.com/");
            URLConnection urlc=url.openConnection();
            InputStream input=urlc.getInputStream();

            int i;
            while((i=input.read())!=-1){
                System.out.println((char)i);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}