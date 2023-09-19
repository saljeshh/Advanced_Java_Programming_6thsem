
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame{
    BorderLayoutDemo(){
        JButton asia = new JButton("Asia");
        JButton europe = new JButton("Europe");
         JButton na = new JButton("NorthAmerica");
          JButton sa = new JButton("SouthAmerica");
           JButton africa = new JButton("Africa");
            JButton aus = new JButton("Australia");
            
            
            setLayout(new BorderLayout());
            
           add(asia,BorderLayout.NORTH);
           add(europe,BorderLayout.WEST);
           add(na,BorderLayout.SOUTH);
           add(sa,BorderLayout.EAST);
           add(africa,BorderLayout.EAST);
           add(aus,BorderLayout.CENTER);

            setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(3);
           
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
