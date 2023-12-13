import java.io.*;
public class Student {
public static void main(String []args){
    try{
FileOutputStream fout=new FileOutputStream("Student.dat");
String str="This is student file object";
byte[]b=str.getBytes();
fout.write(b);
System.out.println("file write successfuly");
fout.close();
FileInputStream fis=new FileInputStream("Student.dat");
int ch;
while((ch=fis.read())!=-1)
{
    System.out.print((char)ch);
}
fis.close();
}catch(Exception e)

{
    System.out.print(e.getMessage());
}
}
}