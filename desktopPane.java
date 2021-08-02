import javax.swing.*;
import java.awt.*;
import java.util.ConcurrentModificationException;

public class desktopPane extends JFrame {

    public desktopPane(){
        super("Desktop pane");

        DesktopPane desktopPane = new DesktopPane();
        Container container = getContentPane();
        container.add(desktopPane,BorderLayout.CENTER);
        desktopPane.display(desktopPane);

        //Borderlayout is used so the layout is commented.
        //setLayout(null);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new desktopPane();
    }

    class DesktopPane extends JDesktopPane{
        int numfram = 3,x=30,y=30;
        public void display(DesktopPane dp){
            for (int i =0;i<numfram;i++)
            {
                JInternalFrame jInternalFrame = new JInternalFrame("Internal Frame",true,true, true, true);
                jInternalFrame.setBounds(x,y,250,50);
                Container container = jInternalFrame.getContentPane();
                container.add(new JLabel("pane 1"));
                dp.add(jInternalFrame);
                jInternalFrame.setVisible(true);
               // y=+85;
            }
        }
    }

}
