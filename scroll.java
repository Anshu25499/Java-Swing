import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class scroll {

    public JFrame jFrame;

    public scroll(){
        jFrame = new JFrame("Scroll Bar");

        JLabel jLabel= new JLabel();
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setSize(300,40);

        JScrollBar jScrollBar = new JScrollBar();
        jScrollBar.setBounds(100,100,40,150);

        jScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jLabel.setText("Your position is "+jScrollBar.getValue());
            }
        });

        jFrame.add(jLabel);
        jFrame.add(jScrollBar);
        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new scroll();
    }
}
