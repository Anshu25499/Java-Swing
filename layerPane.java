import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import java.awt.*;

public class layerPane extends JFrame {

    public layerPane(){
      super("Layer Pane");

      JLayeredPane jLayeredPane = new JLayeredPane();

      JButton top = new JButton();
      top.setBackground(Color.CYAN);
      top.setBounds(20,20,50,50);
      JButton middle = new JButton();
      middle.setBackground(Color.blue);
      middle.setBounds(40,40,50,50);
      JButton last = new JButton();
      last.setBackground(Color.GREEN);
      last.setBounds(60,60,50,50);

      jLayeredPane.add(top);
      jLayeredPane.add(middle);
      jLayeredPane.add(last);

      add(jLayeredPane);

      setSize(400,300);
      setVisible(true);
    }

    public static void main(String[] args) {
         new layerPane();
    }
}
