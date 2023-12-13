
import java.util.*;
class FileExcption
{
    public static void main(String[]ars)
    {
        try {
            Scanner sc=new Scanner(System.in);
                System.out.println("Enter any integer number");
               // int a=nextInt();
               int a = sc.nextInt();
                System.out.println("The Enteger number is:"+a);
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("Please enter integer number");
            }
        {
            // TODO: handle exception
        }
    }
}