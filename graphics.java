import javax.swing.*;
import java.awt.*;

//Not working code, check it and solve the problem.

public class graphics extends Canvas {
    public void graphics(Graphics g){
//        g.drawString("Himanshu",40,40);
//        setBackground(Color.GREEN);
//        g.fillRect(20,50,100,100);
//        g.drawOval(40,120,50,50);
//        setForeground(Color.cyan);
//        g.fillOval(80,100,50,50);
//        g.drawArc(30,150,50,50,20,60);
//        setBackground(Color.black);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image i = toolkit.getImage("C:\\Users\\Himanshu\\Pictures\\Screenshots\\Screenshot (9).png");
        g.drawImage(i,100,100,this);
    }

    public static void main(String[] args) {
        graphics e = new graphics();
        JFrame jFrame = new JFrame("Graphics");
        jFrame.add(e);

        jFrame.setSize(400,400);
       // jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
