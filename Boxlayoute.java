import java.awt.*;
import javax.swing.*;
public class Boxlayoute extends Frame{
    Button b[];
    Boxlayoute(){
        b=new Button[5];
        for(int i=0;i<5;i++){
            b[i]=new Button("Button"+(i+1));
            add(b[i]);
        }
        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));    
        setSize(400,400);
        setVisible(true);
    }
    public static void main (String[]args){
     new Boxlayoute();
    }
}