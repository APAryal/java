import javax.swing.*;
import java.awt.event.*;
class Test implements ActionListener{
    JFrame f;
    JTextField t1,t2,t3;
    JButton b1;
    Test(){
        f=new JFrame("Add two number");
        t1=new JTextField();
        t1.setBounds(200,50,150,30);
        f.add(t1);
        t2=new JTextField();
        t2.setBounds(200,80,150,30);
        f.add(t2);
        t3=new JTextField();
        t3.setBounds(200,110,150,30);
        f.add(t3);
        b1=new JButton("sum");
        b1.setBounds(90,200,100,30);
        f.add(b1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource()==(b1)){
        c=a+b;
        t3.setText(String.valueOf("Result is:"+c));
        }
    }
    public static void main(String[]args){
        new Test();
    }
}