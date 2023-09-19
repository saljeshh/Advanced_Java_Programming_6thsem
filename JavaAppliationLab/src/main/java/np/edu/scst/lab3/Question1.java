package np.edu.scst.lab3;

import javax.swing.*;
import java.awt.*;

public class Question1 extends JFrame {

    Question1(){
        JButton jb1 = new JButton("Header");
        JButton jb2 = new JButton("Sidebar");
        JButton jb3 = new JButton("Footer");
        JButton jb4 = new JButton("Ads");
        JButton jb5 = new JButton("Content");


        setLayout(new BorderLayout());
        add(jb1, BorderLayout.NORTH);
        add(jb2, BorderLayout.WEST);
        add(jb3, BorderLayout.SOUTH);
        add(jb4, BorderLayout.EAST);
        add(jb5, BorderLayout.CENTER);


        setVisible(true);
        setTitle("Border layout");
        setSize(400,400);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Question1();
    }
}
