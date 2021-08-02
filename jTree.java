import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.jar.JarEntry;

public class jTree {

    public JFrame jFrame;

    public jTree(){

        jFrame = new JFrame("JTree Creation");


        DefaultMutableTreeNode file = new DefaultMutableTreeNode("file");
        DefaultMutableTreeNode save = new DefaultMutableTreeNode("save");
        DefaultMutableTreeNode exit = new DefaultMutableTreeNode("exit");
        DefaultMutableTreeNode city = new DefaultMutableTreeNode("city");

        DefaultMutableTreeNode car = new DefaultMutableTreeNode("car");
        DefaultMutableTreeNode bike = new DefaultMutableTreeNode("bike");
        DefaultMutableTreeNode scooty = new DefaultMutableTreeNode("scooty");
        DefaultMutableTreeNode bus = new DefaultMutableTreeNode("bus");


        city.add(car);
        city.add(bike);
        city.add(scooty);
        city.add(bus);

        file.add(save);
        file.add(exit);
        file.add(city);

        JTree jTree = new JTree(file);
        jFrame.add(jTree);

        jFrame.setSize(400,300);

        /*
        Here we have to make the layout null so to get the tree.
         */
       // jFrame.setLayout(null);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new jTree();
    }
}
