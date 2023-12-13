import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class B5 extends JFrame implements ItemListener{
    JTextField tf;
    JCheckBox bold,italic,plain;
    Font defaultFont=new Font("Times New Roman",Font.PLAIN,20);
    public B5(){
        setSize(400,400);
        tf=new JTextField("Enter some text");
        tf.setFont(defaultFont);
        bold=new JCheckBox();
        italic =new JCheckBox();
        plain=new JCheckBox();
        tf.setBounds(100,50,200,30);
        bold.setBounds(100,120,100,30);
        italic.setBounds(100,150,100,30);
        plain.setBounds(100,180,100,30);
        bold.addItemListener(this);
        italic.addItemListener(this);
        plain.addItemListener(this);
        add(tf);
        add(bold);
        add(italic);
        add(plain);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==bold){
            if(e.getStateChange()==1){
                tf.setFont(new Font("Times New Roman",Font.BOLD,20));
            }
            else{
                tf.setFont(defaultFont);
            }
        }else if(e.getSource()==italic){
            if(e.getStateChange()==1){
                tf.setFont(new Font("Times New Romain",Font.ITALIC,200));
            }
            else{
                tf.setFont(defaultFont);
            }
        }else{
            tf.setFont(new Font("Time New Roman",Font.PLAIN,20));
        }
    }
    public static void main(String[]args){
        new B5();
    }
}