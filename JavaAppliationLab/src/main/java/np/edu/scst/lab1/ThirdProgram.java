package np.edu.scst.lab1;

import javax.swing.*;


public class ThirdProgram extends JFrame {
    
    ThirdProgram(){
        
        ImageIcon icon = new ImageIcon("scst.jpg");
        
        JLabel jb = new JLabel(icon);
        add(jb);
        
        
        setVisible(true);
        setSize(500,500);
        setTitle("Hello world JLabel");
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new ThirdProgram();
    }
}
