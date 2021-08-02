import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox {
    JFrame jFrame;
    JComboBox jComboBox,jComboBox1;
    public comboBox(){
        jFrame = new JFrame("ComboBox");

        String name[]={"anshu","himanshu","ghanshyam"};
        String city[]={"raipur","kolkata","manali"};

        jComboBox = new JComboBox(name);
        jComboBox.setBounds(50,50,100,30);

        jComboBox1 = new JComboBox(city);
        jComboBox1.setBounds(170,50,100,30);

        JLabel jLabel = new JLabel("Click button to get the selected item.");
        jLabel.setBounds(50,150,350,30);

        JButton jButton = new JButton("click me");
        jButton.setBounds(110,200,100,30);

        jFrame.add(jComboBox);
        jFrame.add(jComboBox1);
        jFrame.add(jLabel);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Your name is "+jComboBox.getItemAt(jComboBox.getSelectedIndex())+" and your city is "+jComboBox1.getItemAt(jComboBox1.getSelectedIndex())+" .");
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new comboBox();
    }
}
