import javax.swing.*;
import  java.awt.event.*;
public class APmenu extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file;
    JMenuItem add,subtract,close;
    JTextField args1,args2,result;
    JLabel l1,l2,l3;
    APmenu(){
        mb=new JMenuBar();
        file=new JMenu("File");
        add=new JMenuItem("ADD");
        subtract=new JMenuItem("SUBTRACT");
        close=new JMenuItem("CLOSE");
        add.addActionListener(this);
        subtract.addActionListener(this);
        close.addActionListener(this);
        file.add(add);
        file.add(subtract);
        file.add(close);
        mb.add(file);
        setJMenuBar(mb);
        l1=new JLabel("args1");
        l2=new JLabel("args2");
        l3=new JLabel("result");
        l1.setBounds(100,100,100,30);
        l2.setBounds(100,150,100,30);
        l3.setBounds(100,200,100,30);
        args1=new JTextField();
        args2=new JTextField();
        result=new JTextField();
        args1.setBounds(200,100,120,30);
        args2.setBounds(200,150,120,30);
        result.setBounds(200,200,120,30);
        add(l1);
        add(l2);
        add(l3);
        add(args1);
        add(args2);
        add(result);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==close){
                System.exit(0);
            }
            int n1=Integer.parseInt(args1.getText());
            int n2=Integer.parseInt(args2.getText());
            if(e.getSource()==add){
             result.setText(String.valueOf(n1+n2));
            }
            else if(e.getSource()==subtract){
                result.setText(String.valueOf(n1-n2));
            }
        }catch(NumberFormatException ex){
            result.setText("Invalid Input");
        }
    }
    public static void main(String[]args){
        new APmenu();
    }
}