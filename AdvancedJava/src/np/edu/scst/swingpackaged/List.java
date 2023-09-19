
package np.edu.scst.swingpackaged;
import javax.swing.*;
import java.awt.FlowLayout;


public class List extends JFrame {
    
    List(){
        String[] countries = {"Nepal","India","China"};
        JList jlist = new JList(countries);
        add(jlist);
        
        
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
    }
    
    public static void main(String[] args) {
        
        new List();
    }
}
