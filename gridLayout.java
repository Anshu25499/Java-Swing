import javax.swing.*;
import java.awt.*;

public class gridLayout {

    public JFrame jFrame;

    public gridLayout(){

        jFrame = new JFrame("Grid Layout");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        jFrame.add(b4);
        jFrame.add(b5);
        jFrame.add(b6);
        jFrame.add(b7);
        jFrame.add(b8);
        jFrame.add(b9);

        jFrame.setLayout(new GridLayout(3,3));

        jFrame.setSize(300,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new gridLayout();
    }
}
