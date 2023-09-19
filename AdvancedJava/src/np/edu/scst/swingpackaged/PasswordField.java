
package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;

public class PasswordField extends JFrame {
    PasswordField(){
        JPasswordField j1 = new JPasswordField();
        JPasswordField j2 = new JPasswordField(20);
        JPasswordField j3 = new JPasswordField("HELLO");
        JPasswordField j4 = new JPasswordField("HELLO",20);
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(450,450);
        setDefaultCloseOperation(3);
          
    }
    
    public static void main(String[] args) {
        new PasswordField();
    }
}
