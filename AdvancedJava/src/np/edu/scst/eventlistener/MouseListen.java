package np.edu.scst.eventlistener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseListen extends JFrame{
   MouseListen(){
       JButton jButton = new JButton("Click me");
       
       
       jButton.addMouseListener(new MouseListener(){
           @Override
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
       
       add(jButton);
       
       
       setVisible(true);
       setTitle("Mouse listener demo");
       setSize(500,500);
       setDefaultCloseOperation(3);
   } 
   
    public static void main(String[] args) {
        new MouseListen();
    }
}
