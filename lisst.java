import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lisst {

    public JFrame jFrame;

    public lisst(){

        jFrame = new JFrame("ListCreation");

        JLabel jLabel = new JLabel("Please select!!");
        jLabel.setBounds(10,130,290,30);

        JButton jButton = new JButton("Click here");
        jButton.setBounds(100,180,100,30);

        DefaultListModel<String> l1 = new DefaultListModel<String >();
        l1.addElement("Anshu");
        l1.addElement("Himanshu");
        l1.addElement("Shyam");
        l1.addElement("Ram");

        DefaultListModel<String> l2 = new DefaultListModel<String>();
        l2.addElement("Gupta");
        l2.addElement("Kumar");
        l2.addElement("Choudhary");
        l2.addElement("kapoor");

        JList name = new JList(l1);
        name.setBounds(50,50,100,70);

        JList Lname = new JList(l2);
        Lname.setBounds(170,50,100,70);

        jFrame.add(name);
        jFrame.add(Lname);
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Your name is "+name.getSelectedValue()+" and surname is "+Lname.getSelectedValue());
            }
        });

    }

    public static void main(String[] args) {
        new lisst();
    }
}
