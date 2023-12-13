import javax.swing.*;
import java.awt.event.*;

public class ExampleMenu extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,SelectAll;
    JTextArea ta;
    ExampleMenu()
    {
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("paste");
        SelectAll=new JMenuItem("SelectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        SelectAll.addActionListener(this);
        mb=new JMenuBar();
        file=new JMenu("file");
        edit=new JMenu("edit");
        help=new JMenu("help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(SelectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        ta=new JTextArea();
        ta.setBounds(5,5,360,360);
        add(ta);
        add(mb);
        setJMenuBar(mb);
        setLayout(null);
        setSize(300,300);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==cut)
    ta.cut();
    if(e.getSource()==copy)
    ta.copy();
    if(e.getSource()==paste);
    ta.paste();
    if(e.getSource()==SelectAll);
    ta.selectAll();
    
    }
    public static void main(String[] args) {
        new ExampleMenu();
    }
}