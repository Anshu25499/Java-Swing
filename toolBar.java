import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class toolBar {

    JFrame jFrame;
    public toolBar(){
        jFrame = new JFrame("Tool Bar");

//In this piece of code we are adding button to the toolbar and separating them using the separator.
        JToolBar jToolBar = new JToolBar();
        jToolBar.setRollover(true);
        JButton jButton = new JButton("open");
        jToolBar.add(jButton);
        jToolBar.addSeparator();
        jToolBar.add(new JButton("help"));

//In this piece of code we are creating a combo box which contains some elements and adding the toolbar to the container.
        jToolBar.add(new JComboBox(new String[] {"Himanshu","Gupta","Ramesh","kumar"}));
        Container container = jFrame.getContentPane();
        container.add(jToolBar,BorderLayout.NORTH);

//In this piece of code the textarea is added and a scroll_pane.
        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        container.add(jScrollPane, BorderLayout.EAST);

        jFrame.setSize(400,300);

        //No layout is used because the border layout is used above.
      //  jFrame.setLayout(new FlowLayout());

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new toolBar();
    }
}
