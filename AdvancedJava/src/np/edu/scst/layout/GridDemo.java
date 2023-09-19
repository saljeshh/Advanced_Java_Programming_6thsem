
package np.edu.scst.layout;

import javax.swing.*;
import java.awt.*;

public class GridDemo extends JFrame{
    GridDemo(){
        
        JLabel j1 = new JLabel("Label 1");
        JLabel j2 = new JLabel("Label 2");
        JLabel j3 = new JLabel("Label 3");
        JLabel j4 = new JLabel("Label 4");
        JLabel j5 = new JLabel("Label 5");
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);
        
        //grid layout
        setLayout(new GridLayout(3,2));
        
        setVisible(true);
        setTitle("Grid layout demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new GridDemo();
    }
}
