
package np.edu.scst.swingpackaged;
import javax.swing.*;
import java.awt.FlowLayout;

public class Button extends JFrame {
        
    Button(){
        JButton j1 = new JButton();
        JButton j2 = new JButton("Click me");
        
        add(j1);
        add(j2);
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
    public static void main(String[] args) {
        new Button();
    }
  
}
