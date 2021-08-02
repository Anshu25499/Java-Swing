import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class pane {
//This java class is used to create a pop up box which appears when we cancel the window to ask that you sure want to do that.
    public JFrame jFrame;

    public pane(){
        jFrame = new JFrame("Pane Creation");

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame,"Are you sure?");
                if (a==JOptionPane.YES_OPTION)
                {
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new pane();
    }
}
