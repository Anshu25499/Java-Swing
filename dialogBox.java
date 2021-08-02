import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialogBox {

    public JFrame jFrame;
    static JDialog jDialog;

    public dialogBox(){
        jFrame = new JFrame("Creating Dialog box");

        jDialog = new JDialog(jFrame,"Dialog Box",true);

        JButton jButton = new JButton("Click me");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialog.setVisible(false);
            }
        });

        jDialog.add(new JLabel("Click to exit"));
        jDialog.add(jButton);
        jDialog.setLayout(new FlowLayout());
        jDialog.setSize(300,200);
        jDialog.setVisible(true);

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new dialogBox();
    }
}
