package np.edu.scst.layout;

import javax.swing.*;
import java.awt.*;

public class CardDemo extends JFrame{
    CardDemo(){
        
        JLabel j1 = new JLabel("Hellow 1");
        JLabel j2 = new JLabel("Hello 2");
        
        add(j1);
        add(j2);
        
        // swing default layout is Null layout
        // null layout = shows only the latest element
        // card layout = imposes one component over another
        
        setLayout(new CardLayout());
        
        
        setVisible(true);
        setTitle("Flow layout demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new CardDemo();
    }
}
