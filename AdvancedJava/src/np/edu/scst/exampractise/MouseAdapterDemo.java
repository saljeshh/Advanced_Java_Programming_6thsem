
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterDemo extends JFrame{
    
    MouseAdapterDemo(){
        
        JButton check = new JButton("Click me to see magic");
        check.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e){
               System.out.println("I love you");
           }
        });
        
        add(check);
        
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
    }
    
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
