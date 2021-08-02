import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    To create the action listener outside of the constructor class we have to firstly create all the components
    used inside it globally so it can be accessed outside of the constructor.
 */

public class components {
    public components(){

        JFrame jFrame = new JFrame("Components");

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(40,40,200,200);
        jTextArea.setBackground(Color.CYAN);

        JButton jButton = new JButton("Word Count");
        jButton.setBounds(200,300,120,30);

        JLabel jLabel = new JLabel("Type in the TextArea");
        jLabel.setBounds(40,250,250,40);
//
//        JTextField jTextField = new JTextField();
//        jTextField.setBounds(100,150,140,30);
//
//        jFrame.add(jTextField);
//        jFrame.add(jLabel);
//        jFrame.add(jButton);


        jFrame.add(jTextArea);
        jFrame.add(jButton);
        jFrame.add(jLabel);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //These statements are used to count the text and the character from the textArea in the label.
                String text = jTextArea.getText();
                String word[] = text.split(" ");
                jLabel.setText("Total character = " + text.length()+ " Total word = "+ word.length);
            }
        });


        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    //This statement is used to terminate the frame after clicking on the cross button.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new components();
    }
}
