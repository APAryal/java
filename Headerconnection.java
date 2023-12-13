//heaernconnection content
import java.io.*;
import java.net.*;
public class Headerconnection{
    public static void main(String[]args){
        try{
            URL url=new URL("http://www.google.com");
            HttpURLConnection ucon=(HttpURLConnection)url.openConnection();
            int i;
            for(i=1;i<=8;i++){
                System.out.println(ucon.getHeaderFieldKey(i)+"="+ucon.getHeaderField(i));
            
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}