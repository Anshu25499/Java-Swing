import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class boxLayout {

    /*
    The  box layout is applied in the java awt and not in the swing. So the below code is done in with the awt components.
     */

    Frame jFrame;
    Button jButton[];

    public boxLayout(){
        jFrame = new Frame("Box Layout");
        jButton = new Button[5];

        //The for loop is used to dynamically allocated the button to the gui frame.
        for (int i =0;i<5;i++)
        {
            jButton[i]=new Button("Button"+(i+1));
            jFrame.add(jButton[i]);
        }

        jFrame.setLayout(new BoxLayout(jFrame,BoxLayout.Y_AXIS));
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                jFrame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new boxLayout();
    }
}
