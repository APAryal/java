import java.io.*;
import java.net.*;
import java.util.*;
public class Client{
public static void main(String[]args){
    try{
        Socket s=new Socket("localhost",3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        Scanner br=new Scanner(System.in);
        String serverMsg="";String clientMessage="";
        while(!serverMsg.equals("bye")){
            serverMsg=br.nextLine();
            System.out.println("send message to a server");
            dos.writeUTF(serverMsg);
            dos.flush();
            clientMessage=din.readUTF();
            System.out.println("Server say:"+clientMessage);
        }
        din.close();
        s.close();
        dos.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}