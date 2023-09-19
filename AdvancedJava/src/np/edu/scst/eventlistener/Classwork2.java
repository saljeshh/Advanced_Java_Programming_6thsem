package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classwork2 extends JFrame{
    
    Classwork2(){
        JTextField input1 = new JTextField(5);
        JTextField output1 = new JTextField(5);
        JButton jButton = new JButton("square");
        
        jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               String input = input1.getText();
               //output1.setText("hello");
               int num = 0;
               
               try{
                   num = Integer.valueOf(input);
               }catch(Exception ea){
                   System.out.println(ea);
               }
               
               int result = num*num;
               
               
               output1.setText(String.valueOf(result));
           }
        });
                
                
                
        add(input1);
        add(jButton);
        add(output1);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Classwork demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
        
    }
    
    public static void main(String[] args) {
        new Classwork2();
    }
}
