
package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyPressDemo extends JFrame{
    
    KeyPressDemo(){
       JTextField field = new JTextField(20);
       field.addKeyListener(new KeyListener() {
           public void keyTyped(KeyEvent e){
               System.out.println("Key typed");
           }
           public void keyPressed(KeyEvent e){
               System.out.println("Key Pressed");
           }
           public void keyReleased(KeyEvent e){
               System.out.println("Key Released");
           }

       });
       
       
       add(field);
        
       setVisible(true);
       setTitle("Keyboard listener demo");
       setSize(500,500);
       setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new KeyPressDemo();
    }
}
