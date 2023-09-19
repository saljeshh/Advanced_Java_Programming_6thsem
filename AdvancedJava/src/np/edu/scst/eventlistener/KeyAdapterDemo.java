
package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KeyAdapterDemo extends JFrame{
    KeyAdapterDemo(){
        JTextField field = new JTextField(20);
       field.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               System.out.println("Key typed");
           }

       });
       
       
       add(field);
        
       setVisible(true);
       setTitle("Keyboard listener demo");
       setSize(500,500);
       setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}
