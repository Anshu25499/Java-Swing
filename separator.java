import javax.swing.*;
import java.awt.*;

public class separator {

    public JFrame jFrame;
    JLabel lb1,lb2;

    public separator()
    {
        jFrame = new JFrame("Separator");
        jFrame.setLayout(new GridLayout(1,1));

        lb1 = new JLabel("Above Separator");
        lb1.setBounds(20,20,200,30);
        jFrame.add(lb1);

        JSeparator jSeparator = new JSeparator();
        jFrame.add(jSeparator);

        lb2 = new JLabel("Below Separator");
        lb2.setBounds(20,100,200,30);
        jFrame.add(lb2);

        jFrame.setSize(400,300);
       // jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new separator();
    }
}
