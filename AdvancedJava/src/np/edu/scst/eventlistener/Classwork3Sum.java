package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classwork3Sum extends JFrame{
    Classwork3Sum(){
        
        JTextField input1 = new JTextField(5);
        JTextField input2 = new JTextField(5);
        JButton sumButton = new JButton("Sum");
        JButton diffButton = new JButton("Subtract");
        JTextField output = new JTextField(5);
        
        sumButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                String first = input1.getText();
                String second = input2.getText();
                
                int firstN = Integer.valueOf(first);
                int secondN = Integer.valueOf(second);
                
                int sumR = firstN + secondN;
                
                output.setText(String.valueOf(sumR));
                
            } 
            
        });
        
        
        diffButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                String first = input1.getText();
                String second = input2.getText();
                
                int firstN = Integer.valueOf(first);
                int secondN = Integer.valueOf(second);
                
                int sumR = firstN - secondN;
                
                output.setText(String.valueOf(sumR));
                
            } 
            
        });
        
        add(input1);
        add(input2);
        add(output);
        add(diffButton);
        add(sumButton);
        
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setTitle("Multiple event handler");
        setSize(500,500);
    }
    
    public static void main(String[] args) {
        new Classwork3Sum();
    }
}
