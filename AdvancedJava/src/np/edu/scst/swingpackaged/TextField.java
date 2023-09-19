
package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;

public class TextField extends JFrame {
    
    TextField(){
        JTextField j1 = new JTextField(); // no space
        JTextField j2 = new JTextField(20); // 20 letter space
        JTextField j3 = new JTextField("Hello"); // prefill and space need to fill that text
        JTextField j4 = new JTextField("Hello",20); // prefill and 20 letter space
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        // Flow Layout le chae respoinsibe banauxa thau pugena ki
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("JTextField");
        setSize(450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new TextField();
    }
}
