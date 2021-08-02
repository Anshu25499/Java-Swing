import javax.swing.*;
import java.awt.event.*;

public class Popup implements ActionListener {

    public JFrame jFrame;
    JMenuItem cut, copy, paste, save, exit, view;
    JTextArea jTextArea;

    public  Popup() {
        jFrame = new JFrame("PopUp Menu");

        jTextArea = new JTextArea();
        jTextArea.setBounds(10, 10, 380, 280);

        JPopupMenu jPopupMenu = new JPopupMenu();


        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        view = new JMenuItem("View");

        jPopupMenu.add(cut);
        jPopupMenu.add(copy);
        jPopupMenu.add(paste);
        jPopupMenu.add(save);
        jPopupMenu.add(exit);
        jPopupMenu.add(view);


        jFrame.add(jTextArea);
        jTextArea.add(jPopupMenu);

        /*Here is a error that it is not performed on the specific click on the mouse, it works on any click on the mouse. so it will
        affect the code to get. I have to get the solution of this.
        It should operate on what we want to click like right click or the left click.
         */
        jTextArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPopupMenu.show(jTextArea, e.getX(), e.getY());
            }
        });

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame,"Do you want to exit?");
                if (a==JOptionPane.YES_OPTION)
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });


        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cut)
            jTextArea.cut();
        if (e.getSource()== paste)
            jTextArea.paste();
        if (e.getSource()==copy)
            jTextArea.copy();

    }

    public static void main(String[] args) {
        new Popup();
    }

}


