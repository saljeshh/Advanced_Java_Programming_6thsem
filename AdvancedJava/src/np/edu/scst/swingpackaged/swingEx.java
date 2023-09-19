
package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;


public class swingEx extends JFrame{
    swingEx(){
        JLabel j1 = new JLabel("Hello world");
        JLabel j2 = new JLabel("Hello new Nepal");
        
        add(j1);
        add(j2);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Hello World");
        setSize(450,450);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new swingEx();
    }
}
