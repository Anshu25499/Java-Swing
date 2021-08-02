import javax.swing.*;
import java.awt.*;

public class flowLayout {

    public JFrame jFrame;

    public flowLayout(){

        jFrame = new JFrame("Grid Layout");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");


        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        jFrame.add(b4);
        jFrame.add(b5);
        jFrame.add(b6);

        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

        jFrame.setSize(300,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new flowLayout();
    }
}