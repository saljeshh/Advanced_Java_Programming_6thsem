
package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterDemo extends JFrame{
    MouseAdapterDemo(){
        JButton jButton = new JButton("Click me");
       
       
       jButton.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               System.out.println("Mouse Clicked");
           }
           public void mousePressed(MouseEvent e){
               System.out.println("Mouse Pressed");
           }

       });
       
       add(jButton);
       
       
       setVisible(true);
       setTitle("Mouse listener demo");
       setSize(500,500);
       setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
