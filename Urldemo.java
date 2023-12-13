//exgample url
import java.net.*;
class Urldemo{
public static void main(String[]args){
    try{
        URL url=new URL("https://www.youtube.com/result?search_query=redneck");
        System.out.println("protocal:"+url.getProtocol());
        System.out.println("Host name:"+url.getHost());
        System.out.println("port number:"+url.getPort());
        System.out.println("content:"+url.getContent());
        System.out.println("Query:"+url.getQuery());
        System.out.println("Reference:"+url.getRef());
        System.out.println("Filename:"+url.getFile());
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
