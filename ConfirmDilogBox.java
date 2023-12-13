import javax.swing.*;
import java.awt.event.*;
public class ConfirmDilogBox extends WindowAdapter{
    JFrame f;
    ConfirmDilogBox(){
        f= new JFrame();
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);

    }
    public void windoClosing(WindowEvent e){
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");

        if(a==JOptionPane.YES_OPTION)
        
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[]args){
        new ConfirmDilogBox();
    }
}