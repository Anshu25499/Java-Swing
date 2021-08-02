import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class color implements ActionListener {

    public JFrame jFrame;
    JButton jButton;
    JTextArea jTextArea;

    public color(){
        jFrame = new JFrame("Color Chooser");

        jButton = new JButton("ColorBox");
        jButton.setBounds(150,200,150,30);

        jTextArea = new JTextArea();
        jTextArea.setBounds(0,0,400,170);

        jFrame.add(jButton);
        jFrame.add(jTextArea);

        jButton.addActionListener(this);

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(jFrame,"Choose",Color.cyan);
        jTextArea.setBackground(c);

    }

    public static void main(String[] args) {
        new color();
    }

}
