import javax.swing.*;

public class progressBar {

    public JFrame jFrame;
    JProgressBar jProgressBar;

    public progressBar(){
        jFrame = new JFrame("Progress_Bar");

        jProgressBar = new JProgressBar(0,2000);
        jProgressBar.setBounds(40,80,150,40);
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(true);

        jFrame.add(jProgressBar);

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void download(){
        int i=0;
        while(i<=2000)
        {
           jProgressBar.setValue(i);
           i+=20;
           try {
               Thread.sleep(100);
           }
           catch (Exception e){
               System.out.println(e);
           }
        }
    }

    public static void main(String[] args) {
        progressBar ns = new progressBar();
        ns.download();

    }
}
