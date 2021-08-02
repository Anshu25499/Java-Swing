import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class spinner {

    public JFrame jFrame;
    public spinner(){

        jFrame = new JFrame("Spinner");

        JLabel jLabel = new JLabel("Spinner");
        jLabel.setBounds(20,20,200,30);

        SpinnerModel spinnerModel = new SpinnerNumberModel(0,0,10,1);
        JSpinner jSpinner = new JSpinner(spinnerModel);
        jSpinner.setBounds(20,60,50,30);

        jFrame.add(jSpinner);
        jFrame.add(jLabel);

        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jLabel.setText("Value "+((JSpinner)e.getSource()).getValue());
            }
        });

        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new spinner();
    }
}
