import java.awt.event.*;
class Outers implements ActionListener{
    New n;
    Outers(New n){
        this.n=n;
    }
    public void actionPerfomed(ActionEvent e){
        n.tf.setText("Wellcome");
    }
}