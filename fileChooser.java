import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fileChooser {

    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu jMenu;
    JMenuItem jMenuItem;
    JTextArea jTextArea;

    public fileChooser(){

        jFrame = new JFrame("File Chooser");

        jMenuBar = new JMenuBar();

        jMenu = new JMenu("file");

        jMenuItem = new JMenuItem("open");

        jTextArea = new JTextArea();
        jTextArea.setBounds(10,10,200,200);


        jMenuBar.add(jMenu);
        jMenu.add(jMenuItem);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(jTextArea);

        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (e.getSource()==jMenuItem){
                        JFileChooser jFileChooser = new JFileChooser();
                        int i = jFileChooser.showOpenDialog(jFrame);
                        if (i==JFileChooser.APPROVE_OPTION)
                        {
                            File file = jFileChooser.getSelectedFile();
                            String filepath = file.getPath();
                            try{
                                BufferedReader br = new BufferedReader(new FileReader(filepath));
                                String s1="",s2="";
                                while((s1=br.readLine())!=null)
                                {
                                    s2+=s1+"\n";
                                }
                                jTextArea.setText(s2);
                                br.close();
                            }
                            catch (Exception ex)
                            {
                                System.out.println(ex);
                            }
                        }
            }}
        });

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new fileChooser();
    }
}
