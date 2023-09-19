
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends JFrame {
    
    KeyEventDemo(){
        
        JTextField field = new JTextField(5);
        field.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                System.out.println(e.getKeyChar() + " key typed");
            }
            
            @Override
             public void keyPressed(KeyEvent e){
                 System.out.println(e.getKeyChar() + " key pressed");
             }
             
             @Override
             public void keyReleased(KeyEvent e){
                 System.out.println(e.getKeyChar()  + " key released");
             }
             
      
        });
        
        
        add(field);
            setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(3);
            setLayout(new FlowLayout());
        
    }
    
    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
