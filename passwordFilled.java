import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passwordFilled {

    public JFrame jFrame;
    JLabel jLabel;
    JTextArea jTextArea;
    JTextField jTextField;

    public passwordFilled(){

        jFrame = new JFrame("Fill");

        jLabel = new JLabel("Please Enter");
        jLabel.setBounds(40,10,100,20);

        //password field is created where we can only paste it and cannot copy the thing written in the box.
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,10,150,30);

        JButton jButton = new JButton("check");
        jButton.setBounds(40,40,100,30);

    //Here action listener is used to get the text written in the passowrd place. It is printed on the label beside it.
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jPasswordField.getText());
            }
        });

        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(jPasswordField);

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new passwordFilled();
    }
}
