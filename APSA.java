import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class APSA extends JFrame implements MouseMotionListener,MouseListener{
    JTextField tf1,tf2;
    public APSA(){
        setSize(400,300);
        tf1=new JTextField();
        tf2=new JTextField();
        tf1.setEditable(false);
        tf2.setEditable(false);
        setLayout(new FlowLayout());
       // setLayout(null);
        add(tf1);add(tf2);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseMoved(MouseEvent e){
        String x=String.valueOf(e.getX());
        String y=String.valueOf(e.getY());
        tf2.setText("X"+x+"Y:"+y);
    }
    public void mouseDragged(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){
        tf1.setText("mouse is in!");
    }
    public void mouseExited(MouseEvent e){
        tf1.setText("mouse is Out!");}
        public void mouseClicked(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
    
    public static void main(String[]args){
        new  APSA();
    }
}