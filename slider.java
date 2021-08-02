import javax.swing.*;

public class slider {

    public JFrame jFrame;

    public slider(){
        jFrame = new JFrame("Slider");

        JSlider jSlider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        jSlider.setMinorTickSpacing(2);
        jSlider.setMajorTickSpacing(10);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);

        JPanel jPanel = new JPanel();
        jPanel.add(jSlider);

        jFrame.add(jPanel);
        jFrame.pack();

       // jFrame.setSize(400,300);
       // jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new slider();
    }
}
