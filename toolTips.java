import javax.swing.*;
import java.awt.*;

public class toolTips {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Tool Tips");

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Himanshu\\Pictures\\Screenshots\\Screenshot (9).png");
        jFrame.setIconImage(icon);

        JPasswordField j = new JPasswordField();
        j.setBounds(40,40,200,30);
        j.setToolTipText("Enter your password!!");
        JLabel jLabel = new JLabel("Password");
        jLabel.setBounds(40,80,200,30);

        jFrame.add(j);
        jFrame.add(jLabel);

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
