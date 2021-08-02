import javax.swing.*;
import java.awt.*;

public class splitter extends JFrame {

    private static void splitter() {

        JFrame jFrame = new JFrame("Splitter");

        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.getContentPane().setLayout(new FlowLayout());

        String[] opt1 = {"A","B","C","D","E"};
        JComboBox box1 = new JComboBox(opt1);
        String[] opt2 = {"1","2","3","4","5"};
        JComboBox box2 = new JComboBox(opt2);

        JPanel jPanel = new JPanel();
        jPanel.add(box1);
        JPanel jPanel1 = new JPanel();
        jPanel1.add(box2);

        JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jPanel,jPanel1);
        jFrame.getContentPane().add(jSplitPane);


    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                splitter();
            }
        });
    }
}
