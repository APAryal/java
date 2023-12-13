import java.applet.*;
import java.awt.*;
public class B4 extends Applet {
	public void paint(Graphics g) {
		g.setFont(new Font("Times New Roman",Font.BOLD,20));
		g.setColor(Color.BLUE);
		g.drawString("pokhara university",150,150);
	}

	public static void main(String[] args) {
		new B4();
	}

}
