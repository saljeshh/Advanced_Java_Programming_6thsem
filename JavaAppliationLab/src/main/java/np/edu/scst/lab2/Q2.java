package np.edu.scst.lab2;

//WAP to create a desktop application that can take a number and display whether it is prime or not. Try to optimize the prime number detecting algorithm.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 extends JFrame {
    Q2() {
        JTextField input = new JTextField(5);
        Button check = new Button("Check Prime");
        JTextField output = new JTextField(15);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.valueOf(input.getText());

                boolean flag = false;
                int i;

                for(i = 2; i <= number / 2; i++){
                    if(number % i == 0){
                        flag = true;
                        break;
                    }
                }

                if(!flag){
                    output.setText("Prime number");
                }else{
                    output.setText("Composite Number");
                }
            }
        });

        add(input);
        add(check);
        add(output);

        setSize(500, 500);
        setTitle("Font Family Demo");
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new Q2();
    }
}
