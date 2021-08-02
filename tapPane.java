import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class tapPane {
    public JFrame jFrame;
    public tapPane(){
        jFrame = new JFrame("Tap pane Creation");

        JTextArea j = new JTextArea(200,200);

        JLabel jLabel = new JLabel("Crated in tabbed pane");
        jLabel.setSize(100,100);

        JButton jButton = new JButton("Created in Tabbed pane");
        jButton.setSize(100,40);


        JPanel pannel1 = new JPanel();
        JPanel pannel2 = new JPanel();
        JPanel pannel3 = new JPanel();

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(30,30,200,100);

        jTabbedPane.add("main",pannel1);
        jTabbedPane.add("file",pannel2);
        jTabbedPane.add("help",pannel3);

        pannel1.add(j);
        pannel2.add(jLabel);
        pannel3.add(jButton);

        jFrame.add(jTabbedPane);

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new tapPane();
    }
}
