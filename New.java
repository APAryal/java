import java.awt.*;
import java.awt.event.*;
class New extends Frame{
	TextField tf;
	New(){
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("click me pl");
		b.setBounds(100,120,80,30);
		Outer o=new Outer(this);
		b.addActionListener(o);
		add(b);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);

	}
	public static void main(String[]args){
		new New();
	}
}