import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkBox implements ActionListener {

    public JFrame jFrame;
    JCheckBox checkBox1, checkBox2, checkBox3;

    public checkBox(){

         jFrame = new JFrame("CheckBox Billing");

        JLabel jLabel = new JLabel("Please select item.");
        jLabel.setBounds(20,20,200,30);

        checkBox1 = new JCheckBox("Pizza 100");
        checkBox1.setBounds(40,60,100,30);

        checkBox2 = new JCheckBox("Burger 50");
        checkBox2.setBounds(40,100,100,30);

        checkBox3 = new JCheckBox("Tea 30");
        checkBox3.setBounds(40,140,100,30);

    //This process is used to add image on the button.
        JButton jButton = new JButton("Total",new ImageIcon("C:\\Users\\Himanshu\\Pictures\\Screenshots"));
        jButton.setBounds(20,190,100,30);

        jFrame.add(jLabel);
        jFrame.add(checkBox1);
        jFrame.add(checkBox2);
        jFrame.add(checkBox3);
        jFrame.add(jButton);
        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amt=0;
        String messag="";
        if (checkBox1.isSelected()){
            amt +=100;
            messag += "Pizza 100 \n";
        }if (checkBox2.isSelected()){
            amt +=50;
            messag += "Burger 50 \n";
        }if (checkBox3.isSelected()){
            amt +=30;
         messag += "Tea 30 \n";
        }

       messag += "----------------- \n";
        JOptionPane.showMessageDialog(jFrame,  messag+" Total= "+amt);
    }

    public static void main(String[] args) {
        new checkBox();
    }


}
