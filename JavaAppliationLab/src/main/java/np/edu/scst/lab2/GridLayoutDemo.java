package np.edu.scst.lab2;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame{
    GridLayoutDemo(){
        Button asia = new Button("Asia");
        Button europe = new Button("Europe");
        Button na = new Button("North America");
        Button sa = new Button("South America");
        Button africa = new Button("Africa");
        Button aus = new Button("Australia");

        add(asia);
        add(europe);
        add(na);
        add(sa);
        add(africa);
        add(aus);

        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(2,3));
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
