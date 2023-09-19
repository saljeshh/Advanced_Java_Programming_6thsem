
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;

public class ImageIconDemo extends JFrame{
    
    ImageIconDemo(){
        ImageIcon icon = new ImageIcon("mustang.jpg");
        JLabel jb = new JLabel(icon);
        add(jb);
        
         setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
