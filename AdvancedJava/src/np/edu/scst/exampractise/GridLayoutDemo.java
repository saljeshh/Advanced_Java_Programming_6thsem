/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame{
    GridLayoutDemo(){
        JButton asia = new JButton("Asia");
        JButton europe = new JButton("Europe");
         JButton na = new JButton("NorthAmerica");
          JButton sa = new JButton("SouthAmerica");
           JButton africa = new JButton("Africa");
            JButton aus = new JButton("Australia");
            
            
           add(asia);
           add(europe);
           add(na);
           add(sa);
           add(africa);
           add(aus);

            setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(3);
            setLayout(new GridLayout(3,2));
    }
    
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
