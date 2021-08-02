import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cardLayout extends JFrame implements ActionListener {

    CardLayout cardLayout;
    JButton b1,b2,b3;
    Container c;
    public cardLayout(){

        c = getContentPane();

        cardLayout = new CardLayout(40,40);
        c.setLayout(cardLayout);

        b1 = new JButton("Himanshu");
        b2 = new JButton("Gupta");
        b3 = new JButton("Kumar");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(c);

    }

    public static void main(String[] args) {
        new cardLayout();
    }
}
