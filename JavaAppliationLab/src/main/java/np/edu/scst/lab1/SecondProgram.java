package np.edu.scst.lab1;

import javax.swing.*;
import java.awt.*;

public class SecondProgram extends JFrame{
    SecondProgram(){
        
        JLabel j1 = new JLabel("Hello world");
        
        j1.setForeground(Color.CYAN);
        
        add(j1);
        
        setVisible(true);
        setSize(500,500);
        setTitle("Hello world JLabel");
        setDefaultCloseOperation(3);
        
    }
    
    public static void main(String[] args) {
        new SecondProgram();
    }
}
