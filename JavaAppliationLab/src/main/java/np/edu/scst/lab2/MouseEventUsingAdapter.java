package np.edu.scst.lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventUsingAdapter extends JFrame{
    MouseEventUsingAdapter(){
        JButton check = new JButton("Click me to see Magic in console");

        check.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("I love you 💕");
            }
        });


        add(check);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
        setTitle("Magic Mouse clicked");
        setLayout(new FlowLayout());

    }


    public static void main(String[] args) {
        new MouseEventUsingAdapter();
    }
}
