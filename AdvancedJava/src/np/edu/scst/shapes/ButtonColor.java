package np.edu.scst.shapes;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Color;


public class ButtonColor extends JFrame {
    ButtonColor(){
        JButton red = new JButton("red");
        JButton redOpaq = new JButton("redOpaq");
        JButton blue = new JButton("blue");
        JButton green = new JButton("green");
        JButton redTransparent = new JButton("redTransparent");
        
        red.setBackground(new Color(255,0,0));
        blue.setForeground(Color.WHITE);
        blue.setBackground(new Color(0, 0, 255));
        redOpaq.setBackground(Color.red);
        redOpaq.setOpaque(false);
        redTransparent.setBackground(Color.yellow);
        redTransparent.setOpaque(false);
        
        add(red);
        add(redOpaq);
        add(blue);
        add(green);
        add(redTransparent);
        
        setVisible(true);
        setSize(700,700);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
    
    
    public static void main(String[] args) {
        new ButtonColor();
    }
}
