import javax.swing.*;

public class frame {
    //Creating frame globally and then making an instance of it in the constructor so that we can use its functionality any where.
   // JFrame jFrame;

    public frame(){
        //Creating frame inside the constructor.
//        JFrame jFrame = new JFrame("Inside the constructor.");
//
//        jFrame.setSize(400,300);
//        jFrame.setLayout(null);
//        jFrame.setVisible(true);

        //The frame is created globally and the instance is created here.
//        jFrame = new JFrame();
//
//        jFrame.setTitle("Globally created.");
//        jFrame.setSize(400,300);
//        jFrame.setLayout(null);
//        jFrame.setVisible(true);


    }


    public static void main(String[] args) {
//        new frame();

        //Creating frame inside the main class. The frame can be created inside the main class or it can be called from globally created frame.
        JFrame jFrame = new JFrame();
//
        jFrame.setTitle("Globally created.");
        jFrame.setSize(400,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}
