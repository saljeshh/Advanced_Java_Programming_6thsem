
package np.edu.scst.eventlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prime extends JFrame{
    
    Prime(){
        JTextField input1 = new JTextField(5);
        JButton primeButton = new JButton("Odd or Even");
        JTextField output = new JTextField(15);
        
        primeButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                String first = input1.getText();
                int num = Integer.valueOf(first);
                int i;
                
                boolean flag = false;
                
                for(i = 2; i <= num / 2; i++){
                    if(num % i == 0){
                        flag = true;
                        break;
                    }
                }
                
                if(!flag){
                    output.setText("Prime Number");
                }else{
                    output.setText("Composite Number");
                }
                
            }
        });
        
        
        add(input1);
        add(primeButton);
        add(output);
         
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setTitle("Prime");
        setSize(500,500);
    }
    
    public static void main(String[] args) {
        new Prime();
    }
}
