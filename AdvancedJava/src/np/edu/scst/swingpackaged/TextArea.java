
package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;

public class TextArea extends JFrame{
    TextArea(){
        JTextArea a1 = new JTextArea();
        JTextArea a2 = new JTextArea(3,10);
        JTextArea a3 = new JTextArea("Hello");
        JTextArea a4 = new JTextArea("Hello",3,10);
        
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new TextArea();
    }
}
