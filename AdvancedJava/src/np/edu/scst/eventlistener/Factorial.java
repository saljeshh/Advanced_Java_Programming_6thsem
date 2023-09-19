
package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factorial extends JFrame{
    
    Factorial(){
        
        JTextField input1 = new JTextField(5);
        JButton factorial = new JButton("Factorial");
        JTextField output = new JTextField(5);
        
        
         factorial.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
               
                String input = input1.getText();
                int num = Integer.valueOf(input);
      
                int fact = 1, i;
                
                for(i = 1; i <= num; i++){
                    fact *= i;
                }
                
                
                output.setText(String.valueOf(fact));
            } 
            
        });
         
         add(input1);
         add(factorial);
         add(output);
         
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setTitle("Multiple event handler");
        setSize(500,500);
    }
    
    public static void main(String[] args) {
        new Factorial();
    }
}
