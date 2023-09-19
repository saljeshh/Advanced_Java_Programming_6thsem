package np.edu.scst.shapes;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Color;


public class ColorDemo extends JFrame {
    ColorDemo(){
        JLabel red = new JLabel("red");
        JLabel blue = new JLabel("blue");
        JLabel green = new JLabel("green");
        JLabel redTransparent = new JLabel("redTransparent");
        
        red.setForeground(new Color(255,0,0));
        blue.setForeground(new Color(0, 0, 255));
        
        add(red);
        add(blue);
        add(green);
        add(redTransparent);
        
        setVisible(true);
        setSize(700,700);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
    
    
    public static void main(String[] args) {
        new ColorDemo();
    }
}
