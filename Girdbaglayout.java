import java .awt.*;
import javax.swing.*;
public class Girdbaglayout extends JFrame{
public Girdbaglayout()
{
    setTitle("GirdBagLayout Test");
    setLayout(new GridBagLayout());
    GridBagConstraints gbc=  new GridBagConstraints();
    gbc.gridx=5;
    gbc.gridy=0;
    add(new JButton("Button 1"),gbc);
    gbc.gridx=0;
    gbc.gridy=5;
    add(new JButton("Button 2"),gbc);
    gbc.gridx=2;
    gbc.gridy=4;
    add(new JButton("Button 3"),gbc);

}
public static void main(String[]args)
{
    Girdbaglayout gbcTest=new Girdbaglayout();
    gbcTest.setSize(300,300);
    gbcTest.setVisible(true);
    gbcTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}