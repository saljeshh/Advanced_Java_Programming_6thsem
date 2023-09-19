package np.edu.scst.exampractise;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ActionListenerDemo extends JFrame{
    
    ActionListenerDemo() {
        
        JTextField  input = new JTextField(5);
        JButton check = new JButton("Chek prime");
        JTextField output = new JTextField(10);
        
        
        check.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                int number = Integer.valueOf(input.getText());
                boolean flag = false;
                int i;
                for(i = 2; i < number/2;  i++){
                    if(number % i == 0){
                        flag = true;
                        break;
                    }
                }
                
                if(!flag) output.setText("Prime");
                else output.setText("Not Prime");
            }
            
        });
        
        add(input);
        add(output);
        add(check);
        
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
    }
    
    
    public static void main(String[] args) {
        new ActionListenerDemo();
    }
}
