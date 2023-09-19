package np.edu.scst.eventlistener;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oddeven extends JFrame{
    Oddeven(){
        
        JTextField input1 = new JTextField(5);
        JButton oddButton = new JButton("Odd or Even");
        JTextField output = new JTextField(5);
        
        oddButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String inpt = input1.getText();
                int num = Integer.valueOf(inpt);
                
                if(num % 2 == 0){
                    output.setText("EVEN");
                }else{
                    output.setText("Odd");
                }
            }
        });
        
        
        add(input1);
        add(oddButton);
        add(output);
         
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        setTitle("Multiple event handler");
        setSize(500,500);
    }
    
    public static void main(String[] args) {
        new Oddeven();
    }
}
