package np.edu.scst.layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame{
    
    BorderLayoutDemo(){
        JButton jb1 = new JButton("North");
        JButton jb2 = new JButton("West");
        JButton jb3 = new JButton("South");
        JButton jb4 = new JButton("East");
        JButton jb5 = new JButton("Center");
        
        //border layout arranges the components in the form of directino of compass
        
        setLayout(new BorderLayout());
        add(jb1, BorderLayout.NORTH);
        add(jb2, BorderLayout.WEST);
        add(jb3, BorderLayout.SOUTH);
        add(jb4, BorderLayout.EAST);
        add(jb5, BorderLayout.CENTER);
        
        setVisible(true);
        setTitle("Border layout demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
