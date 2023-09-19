package np.edu.scst.shapes;
import javax.swing.*;
import java.awt.*;

public class ImageDemo extends JFrame{
    ImageDemo(){
        
        ImageIcon icon = new ImageIcon("mustang.jpg");
        
        JLabel jb = new JLabel(icon);
        add(jb);
        
 
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400,400);
        setTitle("Image demo");
        setLayout(new FlowLayout());
    }
    
    public static void main(String[] args) {
        new ImageDemo();
    }
}
