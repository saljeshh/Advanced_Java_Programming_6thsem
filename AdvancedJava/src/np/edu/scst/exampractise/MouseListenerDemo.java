
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo extends JFrame{
    MouseListenerDemo(){
        
        JButton check = new JButton("Click me to use mouse Listener");
        check.addMouseListener(new MouseListener(){
             public void mouseClicked(MouseEvent e){
               System.out.println("Mouse Clicked");
           }
           public void mousePressed(MouseEvent e){
               System.out.println("Mouse Pressed");
           }
           public void mouseReleased(MouseEvent e){
               System.out.println("Mouse Released");
           }
           public void mouseEntered(MouseEvent e){
               System.out.println("Mouse Entered");
           }
           public void mouseExited(MouseEvent e){
               System.out.println("Mouse Exited");
           }
        });
        
        add(check);
        
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400,400);
        setLayout(new FlowLayout());
    }
    
    public static void main(String[] args) {
        new MouseListenerDemo();
    }
}
