import javax.swing.*;

public class rootPane {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Root Pane");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRootPane jRootPane = jFrame.getRootPane();

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jmenu = new JMenu("file");

        jMenuBar.add(jmenu);
        jmenu.add("open");
        jmenu.add("close");
        jRootPane.setJMenuBar(jMenuBar);

        jRootPane.getContentPane().add(new JButton("Click me"));

        jFrame.setSize(400,300);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
