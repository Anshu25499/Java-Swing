import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.AffineTransformOp;

//In this mennu java class checkboxItem selection is also done.

public class menuu implements ActionListener {

    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu file,edit,format,submenu;
    JMenuItem cut,copy,paste,save,exit,zoom,delete,check;
    JTextArea jTextArea;
    JCheckBoxMenuItem jCheckBoxMenuItem;

    public menuu(){
        jFrame = new JFrame("MenuBar");

        jMenuBar = new JMenuBar();

        jTextArea = new JTextArea();
        jTextArea.setBounds(10,10,390,290);

        jCheckBoxMenuItem = new JCheckBoxMenuItem("option");

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        save = new JMenuItem("save");
        exit = new JMenuItem("exit");
        zoom = new JMenuItem("zoom");
        delete = new JMenuItem("delete");
        check = new JMenuItem("check");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =JOptionPane.showConfirmDialog(jFrame,"Do you want to exit?");
                if (a==JOptionPane.YES_OPTION){
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        file = new JMenu("file");

        file.add(save);
        file.add(exit);
        file.add(jCheckBoxMenuItem);

        edit = new JMenu("edit");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        format = new JMenu("format");
        format.add(zoom);

        submenu = new JMenu("submenu");
        file.add(submenu);

        submenu.add(delete);
        submenu.add(check);

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(format);

        jFrame.add(jMenuBar);
        jFrame.setJMenuBar(jMenuBar);

        jFrame.add(jTextArea);
        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cut)
            jTextArea.cut();
        if (e.getSource()==copy)
            jTextArea.copy();
        if (e.getSource()==paste)
            jTextArea.paste();
    }

    public static void main(String[] args) {
        new menuu();
    }
}
