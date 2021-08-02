import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class scrollPaneCode {

    private static void scrollPaneCode(){

        JFrame jFrame = new JFrame("Scroll pane");

        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.getContentPane().setLayout(new FlowLayout());

        JTextArea jTextArea = new JTextArea(20,20);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jFrame.getContentPane().add(jScrollPane);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scrollPaneCode();
            }
        });

    }
}

