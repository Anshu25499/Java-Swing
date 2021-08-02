import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class borderLayout {
    public JFrame jFrame;

    public borderLayout(){
        jFrame = new JFrame("Border Layout");

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        jFrame.add(b1, BorderLayout.NORTH);
        jFrame.add(b2,BorderLayout.SOUTH);
        jFrame.add(b3,BorderLayout.EAST);
        jFrame.add(b4,BorderLayout.WEST);
        jFrame.add(b5, BorderLayout.CENTER);

        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new borderLayout();
    }
}
