import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class toggleButtton implements ItemListener {

    public JFrame jFrame;
    JToggleButton jToggleButton;

    public toggleButtton(){
        jFrame = new JFrame("Toggle Button");

        setjToggleButton();
        setAction();

        jFrame.setSize(400,300);
       // jFrame.setLayout(null);
        jFrame.setLayout(new FlowLayout());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setjToggleButton() {
        jToggleButton = new JToggleButton("on");
        jFrame.add(jToggleButton);
    }

    public void setAction(){
        jToggleButton.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (jToggleButton.isSelected())
            jToggleButton.setText("off");
        else
            jToggleButton.setText("on");

    }

    public static void main(String[] args) {
        new toggleButtton();
    }


}
