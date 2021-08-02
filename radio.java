import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radio implements ActionListener {

    public JFrame jFrame;
    JRadioButton rb1,rb2;

    public radio(){

        jFrame = new JFrame("RadioButton");

        rb1 = new JRadioButton("male");
        rb1.setBounds(100,50,100,30);

        rb2 = new JRadioButton("female");
        rb2.setBounds(100,80,100,30);

        JButton jButton = new JButton("click me");
        jButton.setBounds(100,120,100,30);

        jFrame.add(rb1);
        jFrame.add(rb2);
        jFrame.add(jButton);

        jFrame.setLayout(null);
        jFrame.setSize(400,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected())
        {
            JOptionPane.showMessageDialog(jFrame,"Male selected!");
            rb2.setSelected(false);
        }
        if (rb2.isSelected())
        {
            JOptionPane.showMessageDialog(jFrame,"Female selected");
            rb1.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new radio();
    }


}
