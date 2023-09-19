
package np.edu.scst.registration;

import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame{
    Registration(){
        
        JLabel j1 = new JLabel("UserName");
        JLabel j2 = new JLabel("Password");
        
        JTextField i1 = new JTextField(20);
        JTextField i2 = new JTextField(20);
        
        JButton b1 = new JButton("Submit");
        setLayout(null);
        
        add(j1); 
        add(i1);
        add(j2);
        add(i2);
        add(b1);
        //       coordinate x,y , width , height
        j1.setBounds(10,10,200,20);
        j2.setBounds(10,50,200,20);
        i1.setBounds(250,10,200,20);
        i2.setBounds(250,50,200,20);
        b1.setBounds(150,100,200,20);
        
        
        
        setVisible(true);
        setTitle("Registration form ");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new Registration();
    }
}
