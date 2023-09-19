/*
    To show font families and styles in swing application
 */
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;

public class FontDemo extends JFrame{
    FontDemo(){
        JLabel j1 = new JLabel("Font");
        JLabel j2 = new JLabel("Family");
        JLabel j3 = new JLabel("Demo");
        
        j1.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        j2.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 30));
        j3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        
        
        add(j1);
        add(j2);
        add(j3);
       
        setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(3);
            setLayout(new FlowLayout());
    }
    
    
    public static void main(String[] args) {
        new FontDemo();
    }
}
